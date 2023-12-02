
import java.math.BigInteger;
import java.util.Scanner;

public class TONG {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t-- > 0) {
//            String s1 = sc.nextLine().trim();
//            String s2 = sc.nextLine().trim();
//            int n = Math.max(s1.length(), s2.length());
//
//            while (s1.length() < n) {
//                s1 = "0" + s1;
//            }
//            while (s2.length() < n) {
//                s2 = "0" + s2;
//            }
//            String num = "";
//            int nho = 0;
//            for (int i = 0; i < n; i++) {
//                int c = Integer.parseInt(String.valueOf(s1.charAt(s1.length() - i - 1))) + Integer.parseInt(String.valueOf(s2.charAt(s2.length() - i - 1))) + nho;
//                if (c >= 10) {
//                    c -= 10;
//                    nho = 1;
//                } else {
//                    nho = 0;
//                }
//                num = String.valueOf(c) + num;
//            }
////            for (int i=s1.length()-n-1; i>=0; i--) {
////                num = s1.charAt(i) + num;
////            }
//            System.out.println(num);
//        }
        
//    }
    
    static Scanner scanner = new Scanner(System.in);
    public static void solve(){
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        System.out.println(a.add(b));
    }
    public static void main(String[] args) {
        int test = scanner.nextInt();
        while(test>0)
        {
            solve();
            test--;
        }
    }
}
