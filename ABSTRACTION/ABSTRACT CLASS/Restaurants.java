abstract class Restaurant {
    abstract void serveFood();
}

class VegRestaurant extends Restaurant {
    void serveFood() {
        System.out.println("Serving vegetarian dishes.");
    }
}

class NonVegRestaurant extends Restaurant {
    void serveFood() {
        System.out.println("Serving non-vegetarian dishes.");
    }
}

public class Restaurants {
    public static void main(String[] args) {
        Restaurant veg = new VegRestaurant();
        Restaurant nonVeg = new NonVegRestaurant();

        veg.serveFood();
        nonVeg.serveFood();
    }
}
