package VehicleAbstract;

abstract class Vehicle{
    String brand;
    String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    void displayDetails(){
        System.out.println("Brand: " +this.brand);
        System.out.println("Model: " +this.model);
    }
    abstract void startEngine();
}
class Car extends Vehicle{
    Car(String brand, String model){
        super(brand, model);
    }
@Override
void startEngine(){
    System.out.println("Car engine started");
}
}
class Bike extends Vehicle{
    Bike(String brand, String model){
        super(brand, model);
    }
    @Override
    void startEngine(){
        System.out.println("Bike engine started");
    }
}
public class Main {
    public static void main(String[] args){
  Vehicle myObj = new Car("toyota", "corolla");
  myObj.displayDetails();
  myObj.startEngine();
        System.out.println('\n');
  Vehicle myObj1 = new Bike("Pulsar", "R14");
  myObj1.displayDetails();
 myObj1.startEngine();
    }
}
