abstract class Order {
    abstract double calculateTotal();
}

class OnlineOrder extends Order {
    private double itemPrice, shippingFee;

    OnlineOrder(double itemPrice, double shippingFee) {
        this.itemPrice = itemPrice;
        this.shippingFee = shippingFee;
    }

    double calculateTotal() {
        return itemPrice + shippingFee;
    }
}

class InStoreOrder extends Order {
    private double itemPrice, discount;

    InStoreOrder(double itemPrice, double discount) {
        this.itemPrice = itemPrice;
        this.discount = discount;
    }

    double calculateTotal() {
        return itemPrice - discount;
    }
}

public class Orders {
    public static void main(String[] args) {
        Order online = new OnlineOrder(1000, 50);
        Order inStore = new InStoreOrder(1000, 100);

        System.out.println("Online Order Total: $" + online.calculateTotal());
        System.out.println("In-Store Order Total: $" + inStore.calculateTotal());
    }
}
