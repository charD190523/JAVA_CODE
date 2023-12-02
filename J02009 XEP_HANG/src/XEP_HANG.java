
import java.util.Arrays;
import java.util.Scanner;


class Routine implements Comparable<Routine>{
    private int bd, dai, kt;
    
    public Routine (int bd, int dai) {
        this.bd = bd;
        this.dai = dai;
        this.kt = bd + dai;
    } 
    
    public void setKt (int kt) {
        this.kt = kt;
    }
    
    public int getKt () {
        return kt;
    }
    
    public int getBd () {
        return bd;
    }
    
    public int getDai () {
        return dai;
    }
    
    public String toString () {
        return bd + " " + dai + " " + kt; 
    }
    
    @Override
    public int compareTo(Routine o) {
        return Integer.compare(bd, o.bd);
    }
}
public class XEP_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Routine [] rt = new Routine [n];
        for (int i=0; i<n; i++) {
            int bd = sc.nextInt();
            int dai = sc.nextInt();
            rt[i] = new Routine (bd, dai);
        }
        Arrays.sort(rt);
//        for (Routine x : rt) {
//            System.out.println(x);
//                    
//        }
        long time = rt[0].getKt();
        int res = rt[0].getKt();
        for (int i = 0; i<n-1; i++) {
            if (rt[i].getKt() <= rt[i+1].getBd()) {
                if (time < rt[i+1].getKt()) {
                    time = rt[i+1].getKt();
//                    rt[i+1].setKt();
                }
              
            }
            else {
                time += rt[i+1].getDai();
                rt[i+1].setKt((int)time);
            }
        }
        System.out.println(time);
    }
}
