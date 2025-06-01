// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
// Subclass
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.sound(); // Calls Animal's sound()
        b.sound(); // Calls Dog's sound() due to method overriding
    }
}