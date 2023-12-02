import java.util.Scanner;
public class SORT {
    public static Scanner sc = new Scanner (System.in);
    public static void testcase (int [] a, int n) {
        for (int i=0; i<n; i++) {
            int key = a[i];
            int j = i -1;
            
            while (j>=0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            System.out.print("Buoc " + i + ": ");
            for (int k=0; k<=i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = sc.nextInt ();
        int [] a = new int [n];
        for (int i=0; i<n; i++)  {
            a[i] = sc.nextInt();
        }
        testcase (a, n);
    }
}
