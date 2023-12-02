import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
public class NUM {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("DATA.in"));
        Map <Integer, Integer> mp = new HashMap <> ();
        while (sc.hasNext()) {
            int a = Integer.parseInt(sc.next());
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a)+1);
            }
            else mp.put(a, 1);
        }
        Set <Integer> s = mp.keySet();
        for (int x : s) {
            System.out.println(x + " " + mp.get(x));
        }
    }
}
