
import java.util.Scanner;
import java.util.Stack;


public class DAU_TU {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int [] a = new int [n+1];
            for (int i=1; i<=n; i++) {
                a[i] = sc.nextInt();
            }
            a[0] = 9999999;
            Stack <Integer> st = new Stack <>();
            st.push(0);
            for (int i=1; i<=n; i++) {
                while (!st.isEmpty() && a[st.peek()] <= a[i]) {
                    st.pop();
                }
                System.out.print(i - st.peek() + " ");
                st.push(i);
            }
            System.out.println();
        }
    }
}
