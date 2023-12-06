import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Assign-1
 */
public class Ass1 {

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String s=br.readLine();
          int count=0;
          for (int i = 0; i < args.length; i++) {
               if(args[i].equals(s))
                    count++;
          }
          System.out.print(count);
     }
}