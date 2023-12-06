abstract class A {
     abstract void f1();

     abstract class B {
          abstract void f2();
     }
}

/**
 * C
 */
interface C {

     void f3();
}

interface D {
     void f4();
}

interface L extends C, D {
     void f5();
}

interface M {
     void f6();

     interface N {
          void f7();
     }
}

class X extends A implements L, M, M.N {

     void f1() {
          System.out.println("Function f1() from class A");
          F obj = new F();
          obj.f2();
     }
     public void f6(){
          System.out.println("F6 Function");
     }
     public void f7(){
          System.out.println("F7 Function");
     }
     public void f5(){
          System.out.println("F5 Function");
     }
     public void f3(){
          System.out.println("F3 Function");
     }
     public void f4(){
          System.out.println("F4 Function");
     }

     class F extends B {

          void f2() {
               System.out.println("Function f2() from nested interface B");
          }
     }
}

public class Ass6 {
     public static void main(String[] args) {
          X myClass = new X();
          myClass.f1();
          myClass.f3();
          myClass.f4();
          myClass.f6();
          myClass.f7();
     }
}
