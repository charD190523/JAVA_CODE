
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CapSo {
//    public static int n = (int) 1e6;
//    public static int [] prime = new int [n+1];
    
    public static boolean checkNT (int n) {
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n>=2;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inp1 = new ObjectInputStream (new FileInputStream ("DATA1.in"));
        List <Integer> list1 = (ArrayList<Integer>) inp1.readObject();  
//        Collections.sort(list1);
        Set <Integer> s1 = new TreeSet <> ();
        for (int x : list1) {
            if (checkNT(x)) s1.add(x);
        }
//        inp1.close();
        ObjectInputStream inp2 = new ObjectInputStream (new FileInputStream ("DATA2.in"));
        List <Integer> list2 = (ArrayList <Integer>) inp2.readObject();
//        Collections.sort(list2);
        Set <Integer> s2 = new TreeSet <> ();
        for (int x : list2) {
            if (checkNT(x)) s2.add (x);
        }
        final int sum = 1000000;
        for (Integer x : s1 ) {
            if (x*2 >= sum) break;
            if (s2.contains(sum-x)) {
                System.out.println(x + " " + (sum-x));
            }
//            if (checkNT (x)) s2.add(x);
        }
    }
}
