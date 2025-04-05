abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with ignition.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is starting with a kick.");
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
