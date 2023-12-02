
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CAP_SO {
    public static boolean checkNT (int n) {
        for (int i=2; i<Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n>=2;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream inp1 = new ObjectInputStream (new FileInputStream("DATA1.in"));
        List <Integer> list1 = (ArrayList<Integer>) inp1.readObject();
        Set <Integer> s1 = new TreeSet <> ();
        for (int x : list1) {
            if (checkNT(x)) s1.add(x);
        }
        
        ObjectInputStream inp2 = new ObjectInputStream (new FileInputStream("DATA2.in"));
        List <Integer> list2 = (ArrayList<Integer>) inp2.readObject();
        
        final int sum = (int) 1e6;
        for (int x : s1) {
            int y = sum - x;
            if (x >= y) break;
            if (s1.contains(y) && !list2.contains(y) && !list2.contains(x)) 
                System.out.println(x + " " + (sum-x));
        }
        
    }
}
