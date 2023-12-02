
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Infor implements Comparable<Infor>{

    private String code, name;
    private int num ;
    
    public Infor (String code, String name, int num) {
        this.code = code;
        this.name = name;
        this.num = num;
    }
    
    public String getCode () {
        return code;
    }
    
    public String toString () {
        return code + " " + name + " " + num;
    }
    
    @Override
    public int compareTo(Infor o) {
        return code.compareTo(o.getCode());
    }
}
public class DSDN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Infor [] list = new Infor [n];
        for (int i=0; i<n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            list[i] = new Infor (code, name, num);
        }
        Arrays.sort (list);
        for (Infor x : list) {
            System.out.println(x);
        }
    }
}
