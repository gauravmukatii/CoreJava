import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo{

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
        FileReader file = new FileReader("abc.txt");

        int id = 100;
        Demo demo = new Demo();
        demo.getName(id);
    }
}
