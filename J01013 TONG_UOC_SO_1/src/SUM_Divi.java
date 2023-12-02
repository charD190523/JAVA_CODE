import java.util.Scanner;
public class SUM_Divi {
    public static final int N =  (int) 2e6;
    public static int [] prime = new int [N+1];
    
    // tìm ước số nguyên tố nhỏ nhất
    public static void setup () {
        for (int i=2; i<=Math.sqrt(N); i++) {
            if (prime[i]==0) {
                for (int j=i; j<=N; j+=i) {
                    if (prime[j]==0) {
                        prime[j] = i;
                    }
                }
            }
        }
        for (int i=2; i<=N; i++) {
            if (prime[i]==0) {
                prime[i] = i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long t = sc.nextInt();
        setup();
        long sum = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
//            if (prime[n] ==0) {
////                break;
//            }
            while (n!=1) {
                sum+=prime[n];
                n/=prime[n];
            }
        }
        System.out.println(sum);
    }
}
