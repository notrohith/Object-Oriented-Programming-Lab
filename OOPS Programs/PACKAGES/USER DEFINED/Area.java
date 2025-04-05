import shapes.Circle;
import shapes.Rectangle;

public class Area {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Rectangle Area: " + r.getArea());
    }
}
