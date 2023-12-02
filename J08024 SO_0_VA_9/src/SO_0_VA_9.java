
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class SO_0_VA_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue <Integer> q = new LinkedList <>();
            q.add(0);
            while (!q.isEmpty()) {
                int a = q.poll();
                int num = 0;
                if (a != 0) {
                    num = a;
                }
                if (num % n == 0 && num > 0) {
                    System.out.println(num);
                    break;
                }
                q.add(a*10+0);
                q.add(a*10+9);
            }
        }
    }
}
