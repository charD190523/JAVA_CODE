import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MH implements Comparable<MH> {
    private String ma, name, donvi;
    private int gianhap, giaban;

    public MH(String ma, String name, String donvi, int gianhap, int giaban) {
        this.ma = ma;
        this.name = name;
        this.donvi = donvi;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public int loinhuan() {
        return giaban - gianhap;
    }

    public int getLoinhuan() {
        return loinhuan();
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + donvi + " " + gianhap + " " + giaban + " " + getLoinhuan();
    }

    @Override
    public int compareTo(MH o) {
        return o.getLoinhuan() - this.getLoinhuan();
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<MH> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            String donvi = sc.nextLine();
            int gianhap = Integer.parseInt(sc.nextLine());
            int giaban = Integer.parseInt(sc.nextLine());
            String ma = "MH" + String.format ("%03d", i);

            MH p = new MH(ma, name, donvi, gianhap, giaban);
            list.add(p);
        }
        Collections.sort(list);

        for (MH pro : list) {
            System.out.println(pro);
        }
    }
}
