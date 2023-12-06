class employee {

     int yoj, yob, basic;
     String empid, name;

     employee(String empid, int basic, int yoj, int yob, String name) throws AgeException, ExpException {
          this.empid = empid;
          this.basic = basic;
          this.yob = yob;
          this.yoj = yoj;
          this.name = name;
          if (Math.abs(2023 - yob) < 60)
               throw new AgeException("Your Age is below 60");
          if (Math.abs(2023 - yoj) < 10)
               throw new ExpException("Your work experience is not enough");

     }

     int calculate(int basic, int yoj) {
          int exp = Math.abs(yoj - 2023);
          int gp = 0;
          if (exp >= 10 && exp < 16) {
               gp = 5000;
          }
          if (exp >= 10 && exp < 16) {
               gp = 15000;
          } else {
               gp = 20000;
          }
          int pension = basic * exp + gp;
          return pension;
     }

}

class AgeException extends Exception {
     public AgeException(String message) {
          super(message);
     }
}

class ExpException extends Exception {
     public ExpException(String message) {
          super(message);
     }
}

public class Ass8 {
     public static void main(String[] args) throws AgeException, ExpException {
          // employee(String empid,int basic,int yoj,int yob,String name)
          employee[] obj = new employee[5];
          try {
               obj[0] = new employee("KD83", 56000, 1963, 1983, "Ikanip");
               // obj[1] = new employee("VK18", 90000, 2009, 1988, "Uppap");
               // obj[2] = new employee("RS45", 80000, 2020, 1980, "Yanarp");
               // obj[3] = new employee("SG99", 56000, 1996, 1972, "Tijnar");
               // obj[4] = new employee("SRT10", 56000, 1989, 1973, "Akibma");

          }
           catch (AgeException e1) {
               System.out.println("Age Exception " + e1.getMessage());
          } 
          catch (ExpException e2) {
               System.out.println("Experience Exception " + e2.getMessage());
          }

     }
}
