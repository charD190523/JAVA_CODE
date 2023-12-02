import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class WordSet {
    private Set <String> se = new TreeSet <> ();
    public WordSet (String name) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("VANBAN.in"));
        while (sc.hasNext()) {
            se.add(sc.next().toLowerCase());
        }
    }
    
    @Override
    public String toString () {
        String s = "";
        for (String x : se) {
            s += x +"\n";
        }
        return s;
    }
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
