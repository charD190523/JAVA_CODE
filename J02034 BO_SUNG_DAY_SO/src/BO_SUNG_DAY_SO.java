
import java.util.Scanner;

public class BO_SUNG_DAY_SO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean check = true;
        int tmp = 1;
        int cnt = 0;
        while (cnt < n) {
            if (a[cnt] > tmp) {
                System.out.println(tmp);
                check = false;
            } 
            else {
                cnt++;
            }
            tmp++;
        }
        if (check) System.out.println("Excellent!");
    }
}
