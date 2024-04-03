import java.util.concurrent.*;

public class ThreadDemo3 implements Callable {

    public Object call(){
        System.out.println("call method started");
        System.out.println(Thread.currentThread());
        System.out.println("call method ended");
        return "success";
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadDemo3 td = new ThreadDemo3();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 15; i++){
            Future submit = executorService.submit(td);
            System.out.println(submit.get().toString());
        }

        executorService.shutdown();

    }
}
