import java.io.*;
class department {
     String HOD_name,Dept_name;
     student s[]=new student[3];
     department(String s1,String s2)
     {
          HOD_name=s2;
          Dept_name=s1;
          s[0]=new student(1,98);
          s[1]=new student(2,88);
          s[2]=new student(3,78);
     }
     public class student {
     
          int roll, marks;
          student(int n, int m)
          {
               roll=n;
               marks=m;
          }
          void show()
          {
               System.out.println(HOD_name);
               System.out.println(Dept_name);
               System.out.println(roll);
               System.out.println(marks);
          }
     }
     void call()
     {
          for (int i = 0; i < 3; i++) {
               s[i].show();
          }
     }
     void call_max()
     {
          student temp = new student(0, 0);
          for (int i = 0; i < 3; i++) {
               if(s[i].marks>temp.marks)
               {
                    temp=s[i];
               }
          }
          System.out.println("Roll "+temp.roll+" has Maximum Marks="+temp.marks);
     }
     void limit(int limit)
     {
          for (int i = 0; i < 3; i++) {
               if(s[i].marks>limit)
               System.out.println("Department is "+Dept_name+" and marks is "+s[i].marks);
          }
     }
}
class Ass42
{
     public static void main(String[] args)throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          department D[]=new department[3];
          D[0]= new department("CSE", "KS");
          D[1]= new department("IT", "MM");
          D[2]= new department("CT", "RS");
          // String str="";
          // str=br.readLine();
          // switch (str) {
          //      case "CSE":
          //           // D[0].call();
          //           // D[0].call_max();
          //           break;
          //      case "IT":
          //           // D[1].call();
          //           // D[1].call_max();
          //           break;
          //      case "CT":
          //           // D[2].call();
          //           // D[2].call_max();
          //           break;
          //      default:
          //           break;
          // }
          int limit=Integer.parseInt( br.readLine());
          D[0].limit(limit);
          D[1].limit(limit);
          D[2].limit(limit);
     }

}