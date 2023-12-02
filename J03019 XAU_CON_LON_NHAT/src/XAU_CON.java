
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class XAU_CON {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Stack <Character> st = new Stack <> ();
        String s = sc.nextLine();
        st.add(s.charAt(0));
        for (int i=1; i<s.length(); i++) {
            while (s.charAt(i) > st.peek()) {
                st.pop();
                if (st.isEmpty()) break;
            }
            st.add(s.charAt(i));
        }
        String s1 = "";
        while (!st.isEmpty()) {
            s1 = st.pop() + s1;
        }
        System.out.println(s1);
    }
}   
