
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


//public class STN {
//    public static boolean isTN (String s) {
//        StringBuilder sr = new StringBuilder(s).reverse();
//        if (!sr.equals(s)) return false;
//        
//        if (s.length()%2==0 || s.length()==1) return false;
//        
//        for (int i=0; i<s.length(); i++) {
//            if ((s.charAt(i)-'0')%2==0) return false;
//        }
//        return true;
//    }
//    
//    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ObjectInputStream inp1 = new ObjectInputStream (new FileInputStream("DATA1.in"));
//        List <Integer> list1 = (ArrayList<Integer>) inp1.readObject();
//        Set <Integer> s1 = new TreeSet <> ();
//        for (int x : list1) s1.add(x);
//        
//        ObjectInputStream inp2 = new ObjectInputStream (new FileInputStream ("DATA2.in"));
//        List <Integer> list2 = (ArrayList<Integer>) inp2.readObject();
//        
//        final int sum = (int) 1e6;
//        int [] cnt = new int [sum+1];
//        
//        for (Integer x : list1) {   // nếu là int thì sẽ lỗi
//            if (isTN(x.toString()) && list2.contains(x)) cnt[x]++;
//        }
//        int dem = 0;
//        for (int i : s1 ) {
//            if (cnt[i]>0) {
//                dem++;
//                System.out.println(i + " " + cnt[i]);
//            }
//            if (dem==10) break;
//        }
//    }
//}

public class Main {
    private static boolean check(int n)
    {
        String s = Integer.toString(n);
        if (s.length() == 1 || s.length() % 2 == 0)
            return false;
        for (int i = 0; i <= s.length() / 2; ++i)
        {
            if (s.charAt(i) % 2 == 0)
                return false;
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) sc2.readObject();
        ArrayList<Integer> num = new ArrayList<>();
        Set<Integer> set1 = new TreeSet<>(a);
        Set<Integer> set2 = new TreeSet<>(b);
        for (int i : set1)
        {
            if (set2.contains(i) && check(i))
                num.add(i);
            if (num.size() == 10)
                break;
        }
        for (int i : num)
            System.out.println(i + " " + (Collections.frequency(a, i) + Collections.frequency(b, i)));
    }
}
/*

 */
