public class StaticVar {

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main static method");
        StaticVar s = new StaticVar();
    }

   public StaticVar(){
        System.out.println("constructor called");
   }
}
