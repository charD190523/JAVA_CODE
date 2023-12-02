
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
public class Intersection {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[m];

        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
            if (map.containsKey(a1[i])) {
                map.put(a1[i], map.get(a1[i])+1);
            }
            else map.put(a1[i], 1);
        }
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
            if (map.containsKey(a2[i])) {
                map.put(a2[i], map.get(a2[i])+1);
            }
            else map.put(a2[i],1);
        }
        
        Set <Integer> set = new TreeSet <> ();
        
        for (int key : map.keySet()) {
            if (map.get(key)>1) {
//                System.out.print(key + " ");
                set.add(key);
            }
        }
        
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
