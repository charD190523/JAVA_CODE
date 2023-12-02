import java.util.Scanner;
public class Gv {
    private String ma, name;
    private int hso, phucap, luong;
    
    public Gv (String ma, String name, int luong) {
        this.ma = ma;
        this.name = name;
        this.luong = luong;
        
        hso = Integer.parseInt(ma.substring(2));
        
        if (ma.substring(0,2).equals("HT")) {
            phucap = 2000000;
        }
        else if (ma.substring(0,2).equals("HP")) {
            phucap = 900000;
        }
        else phucap = 500000;
    }
    
    public int getLuong () {
        return luong * hso + phucap;
    }
    
    public String toString () {
        return ma + " " + name + " " + hso + " " + phucap + " " + getLuong();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        int luong = sc.nextInt();
        Gv p = new Gv (ma, name, luong);
        System.out.println(p);
    }
}
