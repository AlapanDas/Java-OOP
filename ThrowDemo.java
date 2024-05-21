abstract class A {
   int a;

   A(int a) {
    this.a = a;
  }

  public abstract void Display();
}

interface I {
  int i = 10;

  void Show();
}

interface J extends I {
  int j = 20;

  @Override
  void Show();
}

class B extends A implements J {
   B(int a) {
    super(a);
  }

  @Override
  public void Display() {
    System.out.println("a in A: " + a);
  }

  @Override
  public void Show() {
    System.out.println("i in I: " + i);
    System.out.println("j in J: " + j);
  }
}

public class ThrowDemo {
  public static void main(String[] args) {
    B b = new B(5);
    b.Display();
    b.Show();
  }
}