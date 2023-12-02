import java.util.Scanner;
public class Num4n7 {
    public static void solve (String s) {
        long sum = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '4' || c == '7') {
                sum ++;
            }
            
        }
        if (sum == 4 || sum == 7) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        solve (s);
    }
    
}
