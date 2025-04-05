class Car {
    String brand;
    Car(String carBrand) {
        brand = carBrand;
        System.out.println("Car brand: " + brand);
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
    }
}
