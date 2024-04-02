import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo{

    public void divide(int a, int b) throws Exception{
        System.out.println("divide method -- started");
        try {
            int c = a / b;
            System.out.println(c);
        }catch (Exception e){
            throw new InvalidNumberException("Invalid number");
        }finally {
            System.out.println("finally block");
        }

        System.out.println("divide method -- ended");
    }


    public String getName(int id) throws Exception{
        if(id == 100){
            return "rani";
        }else if(id == 101){
            return "raja";
        }else{
            throw new Exception("id not found");
        }
    }
    public static void main(String[] args) throws Exception {    //it is used to ignore compile time exception
//        FileReader file = new FileReader("abc.txt");

        System.out.println("Main method started ...");
        int id = 100;
        Demo demo = new Demo();
        String name = demo.getName(id);
        System.out.println(name);

        demo.divide(100, 0);
        System.out.println("Main method ended ...");
    }
}
