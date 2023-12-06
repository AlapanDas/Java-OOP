import java.lang.Math;
import java.util.Scanner;

abstract class Emp {

     String empid, d_name;
     int joi, basic;
     int years = joi - 2023;

     Emp() {
          empid = "#";
          d_name = "#";
          joi = 0;
          basic = 0;
     }

     Emp(String empid, String d_name, int joi, int basic) {
          this.empid = empid;
          this.d_name = d_name;
          this.joi = joi;
          this.basic = basic;
     }

     abstract int total();
}

class Teacher extends Emp {
     int gp;
     String desg;

     Teacher() {
          gp = 0;
          desg = "";
     }

     Teacher(String empid, String d_name, int joi, int basic, String desg) {

          super(empid, d_name, joi, basic);
          gp = 0;
          this.desg = desg;
     }

     int total() {
          switch (desg) {
               case "Asst":
                    gp = 5000;
                    break;
               case "Associate":
                    gp = 10000;
                    break;
               case "Prof":
                    gp = 15000;
                    break;

               default:
                    break;
          }
          return (int) (basic * Math.abs(joi - 2023) + (basic + gp) * (basic * 0.3));
     }

}

class Clerk extends Emp {
     String level;
     int slab;

     Clerk() {
          level = "";
     }

     Clerk(String empid, String d_name, int joi, int basic, String k) {
          super(empid, d_name, joi, basic);
          level = k;
     }

     int total() {
          int var = 0;
          if (level.equals("LDC"))
               var = (int) (basic * Math.abs(joi - 2023) + basic * 5000 * (basic * 0.3));
          if (level.equals("UDC"))
               var = (int) (basic * Math.abs(joi - 2023) + basic * 10000 * (basic * 0.3));
          return var;
     }
}

class Tech_Asst extends Emp {
     int slab;

     Tech_Asst(String empid, String d_name, int joi, int basic) {
          super(empid, d_name, joi, basic);
     }

     int total() {
          int years = joi - 2023;
          if (years >= 0 && years < 5)
               slab = 5000;
          if (years >= 5 && years < 10)
               slab = 10000;
          if (years >= 10)
               slab = 20000;
          return (int) (basic * years + basic * slab * (basic * 0.3));
     }
}

public class Ass51 {
     public static void main(String[] args) {
          Teacher obj[] = new Teacher[5];
          Tech_Asst obj1[] = new Tech_Asst[5];
          Clerk obj2[] = new Clerk[5];
          for (int i = 0; i < 5; i++) {
               if (i % 2 == 0) {
                    obj[i] = new Teacher("A1", "ABC", 2025, 225, "Asst");
                    obj1[i] = new Tech_Asst("B1", "ABC", 2044, 10);
                    obj2[i] = new Clerk("C2", "ABC", 2024, 270, "UDC");
               } else {
                    obj[i] = new Teacher("A3", "ABC", 2035, 275, "Prof");
                    obj1[i] = new Tech_Asst("B5", "ABC", 2048, 100);
                    obj2[i] = new Clerk("C4", "ABC", 2034, 280, "LDC");
               }
          }
          Scanner sc = new Scanner(System.in);
          // String inp = sc.next();

          // for (int i = 0; i < 5; i++) {
          //      if (obj[i].empid.equals(inp)) {
          //           System.out.println("Employee id= "+obj[i].empid);
          //           System.out.println("Date of Joining= "+obj[i].joi);
          //           System.out.println("Department Name= "+obj[i].d_name);
          //           System.out.println("Basic Salary= "+obj[i].basic);
          //           System.out.println("Total Salary= "+obj[i].total());
          //      }
          //      if (obj1[i].empid.equals(inp)) {
          //           System.out.println("Employee id= "+obj1[i].empid);
          //           System.out.println("Date of Joining "+obj1[i].joi);
          //           System.out.println("Department Name "+obj1[i].d_name);
          //           System.out.println("Basic Salary "+obj[i].basic);
          //           System.out.println("Total Salary "+obj[i].total());
          //      }
          //      if (obj2[i].empid.equals(inp)) {
          //           System.out.println("Employee id= "+obj2[i].empid);
          //           System.out.println("Date of Joining "+obj2[i].joi);
          //           System.out.println("Department Name "+obj2[i].d_name);
          //           System.out.println("Basic Salary "+obj2[i].basic);
          //           System.out.println("Total Salary "+obj2[i].total());
          //      }
          // }

          // THIS IS THE 2nd PART
          // int threshold = sc.nextInt();
          // for (int i = 0; i < 5; i++) {
          //      if (obj[i].total() >= threshold) {
          //           System.out.println("Emp Id = " + obj[i].empid);
          //      }
          //      if (obj1[i].total() >= threshold) {
          //           System.out.println("Emp Id = " + obj1[i].empid);
          //      }
          //      if (obj2[i].total() >= threshold) {
          //           System.out.println("Emp Id = " + obj2[i].empid);
          //      }
          // }

          // // THIS IS 3rd PART
          String value = sc.next();
          for (int i = 0; i < 5; i++) {
               if (value.equals(obj[i].desg)) {
                    System.out.println("Emp Id= " + obj[i].empid);
                    System.out.println("Department Name= " + obj[i].d_name);
                    System.out.println("Designation= " + value);
                    System.out.println("Year of Joining= " + obj[i].joi);
                    System.out.println("Basic Salary=" + obj[i].basic);
                    System.out.println("Total Salary= " + obj[i].total());
               }
          }
          sc.close();
     }
}
