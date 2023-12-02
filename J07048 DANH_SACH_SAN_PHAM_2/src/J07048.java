
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class SP implements Comparable<SP>{
    private String code, name, time;
    private int cost;

    public SP(String code, String name, int cost, String time) {
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.time = time;
    }
    
    public String getCode (){
        return this.code;
    }
    public int getCost () {
        return this.cost;
    }
    
    public String toString () {
        return code + " " + name + " " + cost + " " + time; 
    }

    @Override
    public int compareTo(SP o) {
        if (this.cost == o.getCost() ) return this.code.compareTo(o.getCode());
        return -(this.cost - o.getCost());
    }
}

public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        SP [] sp = new SP [n];
        for (int i=0; i<n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int cost = Integer.parseInt(sc.nextLine());
            String time = sc.nextLine();
            
            sp[i] = new SP (code, name, cost, time);
        }
        Arrays.sort(sp);
        for (SP x : sp) {
            System.out.println(x);
        }
    }
}

