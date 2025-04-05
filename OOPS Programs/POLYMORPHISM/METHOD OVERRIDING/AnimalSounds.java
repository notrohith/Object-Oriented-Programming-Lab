class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos: Moo moo!");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal myAnimal;
        
        myAnimal = new Dog();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound();

        myAnimal = new Cow();
        myAnimal.makeSound();
    }
}
