import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class DIA_CHI_EMAIL {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int t = sc.nextInt();
       sc.nextLine();
       ArrayList <String> ar = new ArrayList <> ();
       while (t-- > 0) {
           String [] a = sc.nextLine().trim().toLowerCase().split("\\s+");
           String s = a[a.length-1];
           for (int i=0; i<a.length-1; i++) {
               s += a[i].charAt(0);
           }
           ar.add (s);
           int count = Collections.frequency(ar, s);
           s += (count==1 ? "" : count) + "@ptit.edu.vn"; 
           System.out.println(s);
       }
    }
}
