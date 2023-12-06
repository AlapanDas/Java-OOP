class A implements Runnable {
     String name;
     int a[];
     Thread t;

     A(String str, int[] array) {
          name = str;
          a = array;
          t = new Thread(this, name);
          t.start();
     }

    public  void run() {
        try {
            if (name=="First") {
                int sum=0;
                for (int i=0; i<5; i++){
                    sum = sum + a[i];
                    Thread.sleep(100);                }
                    System.out.println("Sum= "+sum);
            }
            else {
                if (name=="Second") {
                int mul=1;
                for (int j=5; j<10; j++){
                    mul = mul * a[j];
                    Thread.sleep(100);                }
                    System.out.println("Multiplication="+mul);
            }
            }
        }catch(Exception e)
        {
          System.out.println(e);
        }
    }
}

public class Ass7 {
     public static void main(String[] args) {
          int a[]= new int[]{1,2,3,4,5,6,7,8,9,10};
          A obj=new A("First",a);
          A obj2=new A("Second",a);
          try {
               Thread.sleep(100);
               System.out.println(obj.t.isAlive());
               System.out.println(obj2.t.isAlive());
               obj.t.join();
               obj2.t.join();
          } catch (Exception e) {
               System.out.println(e);
          }
        }
}
