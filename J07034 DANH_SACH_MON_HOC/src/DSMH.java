
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Info implements Comparable<Info> {

    private String code, name;
    private int stc;

    public Info(String code, String name, int stc) {
        this.code = code;
        this.name = name;
        this.stc = stc;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return code + " " + name + " " + stc;
    }

    @Override
    public int compareTo(Info o) {
        return name.compareTo(o.getName());
    }
}

public class DSMH {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        Info [] list = new Info [n];
        for (int i=0; i<list.length; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            list[i]= new Info (code, name, stc);
        }
        Arrays.sort(list);
        for (Info x : list) {
            System.out.println(x);
        }
    }
}
