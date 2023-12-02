
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class DAY_CON {
    public static int n;
    public static Integer [] a = new Integer [100];
    public static Integer [] b = new Integer [100];
    
    public static void check () {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += a[i]*b[i];
        }
        if (sum % 2 !=0) {
            for (int i=1; i<=n; i++) {
                if (b[i]==1) System.out.print(a[i] + " ");
            }
            System.out.println();
        } 
    }
    
    private static void Try(int i) {
        for(int j = 0; j < 2; j++){
            b[i] = j;
            if(i == n){
                check();
            }
            else{
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
//            int [] a = new int [n];
            for (int i=1; i<=n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 1, n+1, Comparator.reverseOrder());
            Try(1);
        }
    }
}
