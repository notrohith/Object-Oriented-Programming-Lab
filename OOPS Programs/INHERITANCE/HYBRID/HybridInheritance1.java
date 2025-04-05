interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

class Animal {
    public Animal() {
        System.out.println("Animal created");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Duck extends Animal implements Walkable, Swimmable {
    public Duck() {
        System.out.println("Duck created");
    }

    public void walk() {
        System.out.println("Duck is walking");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class HybridInheritance1 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.eat();
        d.walk();
        d.swim();
    }
}
