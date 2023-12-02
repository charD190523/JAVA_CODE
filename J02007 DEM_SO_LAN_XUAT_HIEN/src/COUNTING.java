import java.util.Scanner;
import java.util.HashMap;

public class COUNTING {
    public static Scanner sc = new Scanner (System.in);
    public static void counting (int [] a) {
        HashMap <Integer, Integer> map = new HashMap <> ();
        int n = a.length;
        for (int i=0; i<n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }
            else map.put(a[i], 1);
        }
        
        for (int i=0; i<n; i++) {
            if (map.get(a[i])>0) {
                System.out.println(a[i] + " xuat hien " + map.get(a[i]) + " lan");
                map.put(a[i], 0);
            }
            else continue;
        } 
//        Set <Integer> set = map.keySet();
//        System.out.println(map.keySet ());
//        for (int x : map.keySet() ) {
//            System.out.println(x + " xuat hien " + map.get(x) + " lan");
//        }
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int j=1; j<=t; j++) {
            int n = sc.nextInt();
            int [] a = new int [n];
            
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Test " + j + ":");
            counting (a);
        }
    }
}
