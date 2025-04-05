abstract class Ticket {
    abstract double getPrice();
}

class MovieTicket extends Ticket {
    double getPrice() {
        return 250;
    }
}

class BusTicket extends Ticket {
    double getPrice() {
        return 50;
    }
}

public class Tickets {
    public static void main(String[] args) {
        Ticket movie = new MovieTicket();
        Ticket bus = new BusTicket();

        System.out.println("Movie Ticket Price: $" + movie.getPrice());
        System.out.println("Bus Ticket Price: $" + bus.getPrice());
    }
}
