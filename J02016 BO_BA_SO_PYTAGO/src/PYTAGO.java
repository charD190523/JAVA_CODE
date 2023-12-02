
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
public class PYTAGO {
    
    public static boolean check (long [] a, int n) {
        for (int i=2; i<n; i++) {
            int j = 0; int k = i-1;
            while (j<k) {
                if (a[j]+a[k] == a[i]) return true;
                if (a[j]+a[k] > a[i]) k--;
                else j++;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long [] a = new long [n];
            for (int i=0; i<n; i++) {
                a[i] = sc.nextLong();
                a[i] = a[i]*a[i];
            }
            Arrays.sort(a);
//            for (int x : a) {
//                System.out.println(x);
//            }
            if (check (a,n)) System.out.println("YES");
            else System.out.println("NO");
        } 
    }
}
