import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
public class DANH_DAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
//        HashMap <Character, Integer> mp = new HashMap <> ();
//        char [] a = s.toCharArray();
//        for (int i=0; i<a.length; i++) {
//            if (mp.containsKey(a[i])) {
//                mp.put(a[i],mp.get(a[i]+1));
//            }
//            else mp.put(a[i], 1);
//        }
        Set <Character> se  = new TreeSet <> ();
        for (int i=0; i<s.length(); i++) {
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
    }
    
}
