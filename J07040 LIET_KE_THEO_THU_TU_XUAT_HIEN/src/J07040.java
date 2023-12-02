
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, IOException, ClassNotFoundException {
        ObjectInputStream inp1 = new ObjectInputStream (new FileInputStream("NHIPHAN.in") );
        List <String> list = (ArrayList<String>) inp1.readObject();
        Set <String> s = new TreeSet <> ();
        for (String x : list ) {
            String [] list1 = x.trim().toLowerCase().split("\\s++");
            s.addAll(Arrays.asList(list1));
        }
        Scanner sc = new Scanner (new File ("VANBAN.in"));
        while (sc.hasNext()) {
            String ss = sc.next().toLowerCase();
            if (s.contains(ss)) {
                System.out.println(ss);
                s.remove(ss);
            }
        }
    }
}
