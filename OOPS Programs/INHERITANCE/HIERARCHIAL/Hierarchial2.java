class Vehicle {
    public Vehicle() {
        System.out.println("Class Vehicle");
    }
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    public Car() {
        System.out.println("Class Car");
    }
    public void drive() {
        System.out.println("Driving the car");
    }
}

class Bike extends Vehicle {
    public Bike() {
        System.out.println("Class Bike");
    }
    public void ride() {
        System.out.println("Riding the bike");
    }
}

public class Hierarchial2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();

        System.out.println();

        Bike bike = new Bike();
        bike.start();
        bike.ride();
    }
}
