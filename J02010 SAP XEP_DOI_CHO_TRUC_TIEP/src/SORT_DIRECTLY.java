import java.util.Scanner;
public class SORT_DIRECTLY {
    public static Scanner sc = new Scanner (System.in);
    public static void testcase (int n) {
        int [] a = new int [n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[i]>a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            int num = i+1;
            System.out.print("Buoc " + num + ": ");
            for (int k=0; k<n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        testcase (n);
    }
}
