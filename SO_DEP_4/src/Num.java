import java.util.Scanner;
public class Num {
    public static int checkTn (String s) {
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) return 0;
            if (s.charAt(i) != '6' && s.charAt(i)!= '8' || s.charAt(s.length()-i-1) != '6' && s.charAt (s.length()-i-1) != '8') 
                return 0;
        } 
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (checkTn(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
