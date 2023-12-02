import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class NumNT {
    public static int n = (int) 1e6;
    public static int [] prime = new int [n+1];
    public static void ktao () {
        Arrays.fill (prime,1);
        prime [0] = prime [1] = 1;
        for (int i=2; i<=(int)1e3; i++) {
            if (prime[i]==1) {
                for (int j=i*i; j<=n; j+=i) {
                    prime[j]=0;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ktao();
        ObjectInputStream snt = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) snt.readObject();
        
        int [] cnt = new int [n+1];
        for (Integer x : list) {
            cnt[x] += prime[x];
        }
        int dem = 0;
        for (int i=n; i>=2; i--) {
            if (cnt[i] > 0) {
                System.out.println(i + " " +cnt[i]);
                dem++;
            }
            if (dem == 10) break;
        }
    }
}
