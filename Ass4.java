import CSE.*;
import GCECT.*;
import java.util.Scanner;

public class Ass4 {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          CSE x = new CSE();
          GCECT y = new GCECT();

          CSE.student[] obj = new CSE.student[10];

          obj[0] = x.new student(1, 99, "Stuart Timuos");
          obj[1] = x.new student(2, 90, "Udnenhsirk");
          obj[2] = x.new student(3, 69, "Amir");
          obj[3] = x.new student(4, 50, "Iballap");
          obj[4] = x.new student(5, 89, "Stuart Timuos");
          obj[5] = x.new student(6, 90, "Udnenhsirk");
          obj[6] = x.new student(7, 78, "Amir");
          obj[7] = x.new student(8, 42, "Iballap");

          GCECT.teacher[] tit = new GCECT.teacher[5];

          tit[0] = y.new teacher("Stuart Timuos", "CSE", "EPAR");
          tit[1] = y.new teacher("Udnenhsirk", "CT", "SNN");
          tit[2] = y.new teacher("Amir", "CSE", "BDSM");
          tit[3] = y.new teacher("Iballap", "IT", "ED");

          // Question1
          System.out.println("Enter Roll Number");
          int input_roll = sc.nextInt();
          for (int i = 0; i < 8; i++) {
               if (obj[i].roll == input_roll) {
                    for (int j = 0; j < tit.length; j++) {
                         try {
                              if (obj[i].t_name.equals(tit[j].name))
                                   System.out.println("Teacher Name " + tit[j].name + " Teacher Department          "
                                             + tit[j].dept + " Project Details " + tit[j].pro);
                         } catch (Exception e) {
                              // TODO: handle exception
                         }
                    }
               }
          }

          // Question2
          System.out.println("Enter Project Name");
          String p_name = sc.next();
          for (int i = 0; i < tit.length; i++) {
               try {
                    if (p_name.equals(tit[i].pro)) {
                         String nigg = tit[i].name;
                         for (int index = 0; index < obj.length; index++) {

                              if (nigg.equals(obj[index].t_name))
                                   System.out.println("Student Roll " + obj[index].roll + " Student Marks "
                                             + obj[index].marks + " Teacher's Name " + obj[index].t_name);
                         }
                    }
               } catch (Exception e) {
                    // TODO: handle exception
               }
          }

          // Question3
          System.out.println("Enter Project Name");
          String p_name = sc.next();
          for (int i = 0; i < tit.length; i++) {
               try {
                    if (p_name.equals(tit[i].pro))
                         System.out.println("Teacher's Department " + tit[i].dept + " Teacher's Project " + tit[i].pro
                                   + " Teacher's Name " + tit[i].name);
               } catch (Exception e) {
                    // TODO: handle exception
               }
          }
          sc.close();
     }
}