public class Ass23 {
     public static void main(String[] args) {
          String initials="";
          for (int i = 0; i < args.length; i++) {
               if(check(args[i])==true)
                    initials+=args[i].charAt(0);
          }
          System.out.println(initials);
     }

     private static boolean check(String string) {
          string=string.toLowerCase();
          if(string.equals("and") || string.equals("of"))
               return false;
          else
               return true;
     }
}
