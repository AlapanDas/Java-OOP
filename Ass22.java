import java.io.*;

/**
 * Assign-1
 */
public class Ass22 {

     public static void main(String[] args) throws IOException {
          int count = 0;
          for (int i = 0; i < args.length; i++) {
               if (checkpalindrome(args[i])==true)
                    count++;
          }
          System.out.print("Number of Palindrome words="+count);
     }

     private static boolean checkpalindrome(String string) {
          String copy = "";
          for (int i = string.length()-1;i>=0 ;i--) {
               copy+= string.charAt(i);
          }
          if (string.equals(copy))
               return true;
          else
               return false;
     }
}