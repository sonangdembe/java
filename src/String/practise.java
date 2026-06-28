package String;


abstract class Vehicle{
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car started");
    }
}
public class practise {
    public static void main(String[] args) {
     Vehicle myObj = new Car();
     myObj.start();
     myObj.stop();
    }
}
