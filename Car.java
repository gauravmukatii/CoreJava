public class Car {
    void drive(){   //HAS-A relationship
        Engine engine = new Engine();
        engine.start();
        System.out.println("Engine of car started");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
