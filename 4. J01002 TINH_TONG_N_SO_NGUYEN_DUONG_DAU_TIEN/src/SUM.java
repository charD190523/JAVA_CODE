
import java.util.Scanner;

public class SUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            long n = sc.nextLong();
            System.out.println((n + 1) * n / 2);
            t--;
        }
    }
}
