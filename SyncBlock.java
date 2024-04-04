public class SyncBlock implements Runnable{


    //not thread safe
    //without async both threads execute together
    public void printNums1(){
        for(int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + "::" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    //thread safe
    //synchronized method , 1 thread is complete then only another thread will execute
    public synchronized void printNums(){
        for(int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + "::" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void run(){
//        printNums1();
        printNums();
    }

    public static void main(String[] args) {
        SyncBlock s = new SyncBlock();
        Thread t1 = new Thread(s);
        t1.start();
        Thread t2 = new Thread(s);
        t2.start();
    }
}
