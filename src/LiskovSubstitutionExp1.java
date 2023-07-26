
/**
 *SOLID Principles
 * SOLID is an acronym for the first five object-oriented design (ODD)
 * principles by Robert C. Martin
 *-----
 * S ->
 * O ->
 * L -> Liskov Substitution Principle -
 *            Objects of super class shall be replaced with objects of subclasses.
 * I ->
 * D ->
 */


public class LiskovSubstitutionExp1 {

    static void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }
    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Car());
        testDrive(new Bike());
    }
}

class Vehicle{
    public void start(){
        System.out.println("Starting a vehicle");
    }

    public void stop(){
        System.out.println("Stopping a vehicle");
    }
}

class Car extends Vehicle{
    public void start(){
//        System.out.println("Starting a Car");

        throw new RuntimeException("Exception happend....");
    }

    public void stop(){
        System.out.println("Stopping a Car");
    }
}

class Bike extends Vehicle{
    public void start(){
        System.out.println("Starting a Bike");
    }

    public void stop(){
        System.out.println("Stopping a Bike");
    }
}
