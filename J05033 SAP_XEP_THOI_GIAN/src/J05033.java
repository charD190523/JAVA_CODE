import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable <Time> {
    private int gio, phut, giay;
    public Time () {
        
    }
    
    public Time (int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    @Override
    public String toString () {
        return gio + " " + phut + " " + giay;
    }
    
    public int getH () {
        return gio;
    }
    
    public int getM () {
        return phut;
    }
    
    public int getS () {
        return giay;
    }
    
    public int compareTo (Time o) {
        int s1 = gio*3600 + phut*60 + giay;
        int s2 = o.getH()*3600 + o.getM()*60 + o.getS();
        return s1 - s2;
    }
}
public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            Time time = new Time(h, m, s);
            list.add(time);
        }
        Collections.sort(list);
        for (Time i : list) {
            System.out.println(i);
        }
    }
}
