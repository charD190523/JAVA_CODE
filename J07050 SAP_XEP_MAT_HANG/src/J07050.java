
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class MH implements Comparable<MH> {
    private String code, name, group;
    private double inCost, outCost, profit;

    public MH(String code, String name, String group, double inCost, double outCost) {
        this.code = code;
        this.name = name;
        this.group = group;
        this.inCost = inCost;
        this.outCost = outCost;
        this.profit = this.outCost-this.inCost;
    }
    
    public double getProfit () {
        return profit;
    }
    
    public String toString () {
        return code + " " + name + " " + group + " " + String.format("%.2f",profit);
    }
    
    @Override
    public int compareTo(MH o) {
        return -Double.compare(profit, o.getProfit());
    }
    
}
public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        MH [] mh = new MH [n];
        for (int i=0; i<n; i++) {
            String code = "MH" + String.format ("%02d",i+1);
            String name = sc.nextLine();
            String group = sc.nextLine();
            double inCost = Double.parseDouble(sc.nextLine());
            double outCost = Double.parseDouble(sc.nextLine());
            mh[i] = new MH (code, name, group, inCost, outCost);
        }
        Arrays.sort(mh);
        for (MH x : mh ) {
            System.out.println(x);
        }
    }
}
