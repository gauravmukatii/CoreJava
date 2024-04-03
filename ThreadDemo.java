public class ThreadDemo extends Thread {

    public void run(){
        System.out.println("run method started ");
        System.out.println(Thread.currentThread());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("run method ended ");
    }

    public static void main(String[] args) {

        ThreadDemo td = new ThreadDemo();
        Thread t = new Thread(td);
        t.setName("Thread-zero");
        t.start();
        t.setPriority(2);
        Thread t2 = new Thread(td);
        t2.setName("Thread-first");
        t2.setPriority(3);
        t2.start();
    }
}
