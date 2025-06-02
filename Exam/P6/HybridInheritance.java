interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class C {
    void methodC() {
        System.out.println("Method of class C");
    }
}

class D extends C implements B {
    public void methodA() {
        System.out.println("Method of interface A");
    }

    public void methodB() {
        System.out.println("Method of interface B");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
