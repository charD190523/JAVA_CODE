import java.awt.BorderLayout;
import java.util.Scanner;

public class Matran {
    private int [][] a;
    private Scanner sc = new Scanner (System.in);
    
    Matran () {
        
    }
    
    Matran (int n, int m){
        a = new int [n][m];
    }
    
    public void input () {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public void chuyenVi () {
        for (int i=0; i<a[0].length; i++) {
            for (int j=0; j<a.length; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
    private int checkNT (int k) {
        if (k<2) return 0;
        for (int i=2; i<=Math.sqrt(k); i++) {
            if (k%i==0) return 0;
        }
        return 1;
    }
    
    public void printNT () {
        for (int i=0; i<a.length; i++) {
            int check = 1;
            for (int j=0; j<a[0].length; j++) {
                if (checkNT(a[i][j])==0) {
                    check=0;
                    break;
                }
            }
            if (check == 1) {
                for (int j=0; j<a[0].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
