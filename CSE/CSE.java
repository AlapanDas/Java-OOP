package CSE;


public class CSE {
     public class student {
          public int roll;
          public int marks;
          public String t_name;

          public student(int x, int y, String z) {
               roll = x;
               marks = y;
               t_name = z;
          }

          public void show() {
               System.out.println("Student roll no." + roll);
               System.out.println("Student marks" + marks);
          }

     }
}
