//Bài này vẫn WA nha 
import java.util.Scanner;
public class Split {
    public static int check(long n) {
        if (n == 1) return 1;
        if (n==8 || n==0 || n==9) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long num = 0;
            long cnt=1;
            int tmp = 1;
            while (n > 0 ) {
                long a = n % 10;
//                System.out.println(check(a) + " " + cnt + " " + num);
                if (check(a)==-1) {
                    System.out.println("INVALID");
                    tmp = 0;
                    break;
                }
                else {
                    num = check(a)*cnt + num;
                    cnt*=10;
                    n/=10;
                }
            }
            if (tmp == 1) System.out.println(num);
        }
    }
}
