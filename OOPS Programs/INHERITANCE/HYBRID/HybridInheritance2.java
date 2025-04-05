interface Engine {
    void startEngine();
    void stopEngine();
}

interface EntertainmentSystem {
    void playMusic();
}

class Vehicle {
    String model;
    int year;
    
    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle implements Engine, EntertainmentSystem {
    Car(String model, int year) {
        super(model, year);
    }
    
    public void startEngine() {
        System.out.println(model + " car engine started");
    }
    
    public void stopEngine() {
        System.out.println(model + " car engine stopped");
    }
    
    public void playMusic() {
        System.out.println("Playing music in " + model);
    }
    
    void drive() {
        System.out.println(model + " is driving");
    }
}

class Bicycle extends Vehicle {
    Bicycle(String model, int year) {
        super(model, year);
    }
    
    void pedal() {
        System.out.println(model + " bicycle is pedaling");
    }
}

class ElectricBike extends Bicycle implements Engine {
    ElectricBike(String model, int year) {
        super(model, year);
    }
    
    public void startEngine() {
        System.out.println(model + " electric bike motor started");
    }
    
    public void stopEngine() {
        System.out.println(model + " electric bike motor stopped");
    }
}

public class HybridInheritance2 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);
        myCar.displayInfo();
        myCar.startEngine();
        myCar.drive();
        myCar.playMusic();
        
        ElectricBike myBike = new ElectricBike("EcoRide", 2023);
        myBike.displayInfo();
        myBike.startEngine();
        myBike.pedal();
    }
}
