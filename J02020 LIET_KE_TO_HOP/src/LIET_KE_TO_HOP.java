import java.util.Scanner;
public class LIET_KE_TO_HOP {
    public static Scanner sc = new Scanner (System.in);
    public static int [] a ;
    public static int n;
    public static int k;
    public static int check;
    public static void setUp () {
        for (int i=1; i<=k; i++) {
            a[i] = i;
        }
    }
    public static void toHop (int [] a , int k) {
        int i = k;
        while (a[i] == n-k+i) i--;
        if (i==0) check = 0;
        a[i]++;
        for (int j = i+1; j<=k; j++) {
            a[j] = a[j-1] + 1;
        }
        
    }
    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt ();
        check = 1;
        a = new int [n];
        setUp();
        int cnt = 0;
        while (check == 1) {
            for (int i=1; i<=k; i++) {
                System.out.print(a[i] + " ");
            }
            cnt++;
            System.out.println();
            toHop (a,k);
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
