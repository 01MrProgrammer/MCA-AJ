class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();
        p.bark();
        p.weep();
    }
}
