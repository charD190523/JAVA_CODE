
import java.util.Scanner;
import java.util.Stack;


public class NGOAC {
    public static int check(String s) {
        Stack <Character> st = new Stack <> ();
        for (int i=0; i<s.length(); i++) {
            char k = s.charAt(i);
            switch (k) {
                case ')' :
                    if (st.empty() || st.peek() != '(') {
                        return i;
                    }
                    st.pop();
                    break;
                case ']' :
                    if (st.empty() || st.peek() != '[') {
                        return i;
                    }
                    st.pop();
                    break;
                case '}' :
                    if (st.empty() || st.peek() != '{') {
                        return i;
                    }
                    st.pop();
                    break;
                default :
                    st.push(k);
                    break;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int cnt = 0;
            
            while (check(s) != 1 && s.length() > 2) {
                int i = check(s);
                if (i > cnt) cnt = i;
                s = s.substring(i-1);
            }
            if (check(s) == 1) System.out.println(cnt);
            else System.out.println(0);
        }
    }
}
