import java.util.Scanner;
public class SORT_J02013 {
    public static void testcase (int [] a, int n) {
        for (int i=0; i<n-1; i++) {
            boolean check = true;
            for (int j=0; j<n-1; j++) {
                if (a[j] > a[j+1]) {
                    check = false;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if (check) return;
            int num = i+1;
            System.out.print("Buoc " + num + ": ");
            for (int k=0; k<n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        int [] a = new int [n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        testcase (a, n);
    }
}
