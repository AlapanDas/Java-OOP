import java.io.*;

public class Ass41 {
     public static void main(String[] args) throws IOException {          
          int[] arr_real=new int[10];
          int[] arr_img=new int[10];
          int real=0; 
          int img=0;
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          for (int i = 0; i < 6; i++) {
               arr_real[i]=Integer.parseInt(br.readLine());
               arr_img[i]=Integer.parseInt(br.readLine());
          }
          for (int i = 0; i < 6; i++) {
               real+=arr_real[i];
               img+=arr_img[i];          
          }
          for (int i = 0; i < 6; i++) {
               int count=0;
               int key=arr_real[i];
               int value=arr_img[i];
               for (int j = i; j < 6; j++) {
                    if(arr_img[j]==value && arr_real[j]==key)
                    {
                         count++;
                    }
               }
          }
          // System.out.println("Number of Duplicate Complex Numbers are "+count);
          System.out.println("Sum of Complex Number "+real+"+"+img+"i");
     }
}
