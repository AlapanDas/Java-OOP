interface J {
    void methodJ();
}
interface I extends J {
    void methodI();
}
abstract class A {
    abstract void methodA();
}
class B extends A {
    @Override
    void methodA() {
        System.out.println("Method A implementation in class B");
    }

    void methodB() {
        System.out.println("Method B in class B");
    }
}
class C extends B implements I {
    @Override
    public void methodJ() {
        System.out.println("Method J implementation in class C");
    }

    @Override
    public void methodI() {
        System.out.println("Method I implementation in class C");
    }

    void methodC() {
        System.out.println("Method C in class C");
    }
}

public class ThrowDemo {
    public static void main(String[] args) {
        C objC = new C();
        objC.methodJ();
        objC.methodI();
        objC.methodA();
        objC.methodB();
        objC.methodC();
    }
}
