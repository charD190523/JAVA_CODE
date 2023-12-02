import java.util.Scanner;
public class Split {
    
    public static Scanner sc = new Scanner (System.in);
    public static long solve (String s) {
        long n = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '0': 
                case '8':
                case '9':
                    n = n*10;
                    break;
                case '1':
                    n = n*10+1;
                    break;
                default:
                    return 0;
            }
        }
        return n;
    } 
    public static void main(String[] args) {
//        Scanner sc  = new Scanner (System.in );
        int t = sc.nextInt();
        while (t -- > 0) {
            String s  = sc.next();
            if (solve(s)==0) System.out.println("INVALID");
            else System.out.println(solve(s));
        }
    }
}
