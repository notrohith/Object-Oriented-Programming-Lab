class Animal {
    public Animal() {
        System.out.println("Class Animal");
    }
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Class Dog");
    }
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("Class Cat");
    }
    public void meow() {
        System.out.println("Cat meows");
    }
}

public class Hierarchial1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();

        System.out.println();

        Cat c = new Cat();
        c.sound();
        c.meow();
    }
}
