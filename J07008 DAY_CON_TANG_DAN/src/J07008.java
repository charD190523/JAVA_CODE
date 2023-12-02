
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class DAY_CON {

    private int n;
    private int[] a;
    private int[] b;
    private List<String> res = new ArrayList<>();

    public DAY_CON(int n, int[] a) {
        this.n = n;
        this.a = a;
        b = new int[n + 1];
    }

    public void check() {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (b[i] == 1) {
                lst.add(a[i]);
            }
        }
        if (lst.size() >= 2) {
            boolean ok = true;
            for (int i = 1; i < lst.size(); i++) {
                if (lst.get(i) <= lst.get(i - 1)) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                String s = "";
                for (Integer x : lst) {
                    s += x + " ";
                }
                res.add(s);
            }
        }

    }

    public void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n ) {
                check();
            } else {
                Try(i + 1);
            }
        }
    }

    public void solve() {
        Try(1);
        Collections.sort(res);
        for (String i : res) {
            System.out.println(i);
        }
    }
}
public class J07008 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        DAY_CON dd = new DAY_CON(n, a);
        dd.solve();
    }
}
