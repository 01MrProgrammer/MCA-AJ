// Base interface
interface Animal {
    void sound();
}
// Extended interface
interface Pet extends Animal {
    void play();
}
// Implementing extended interface
class Dog implements Pet {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void play() {
        System.out.println("Dog plays fetch");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.play();
    }
}