import java.util.Scanner;

public class DAO_TU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s");
            for (String x : a) {
                int n = x.length();
                char[] chars = x.toCharArray();
                for (int i = 0; i < n / 2; i++) {
                    char tmp = chars[i];
                    chars[i] = chars[n - i - 1];
                    chars[n - i - 1] = tmp;
                }
                System.out.print(new String(chars) + " ");
            }
            System.out.println();
        }
    }
}
