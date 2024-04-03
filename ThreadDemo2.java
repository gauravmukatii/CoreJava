public class ThreadDemo2 implements Runnable{

    public void run(){
        System.out.println("run method started");
        System.out.println("run method Ended");
    }

    public static void main(String[] args) {
        ThreadDemo2 td = new ThreadDemo2();

        Thread t = new Thread(td);
        t.start();

    }
}
