
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        for (int h=0; h<t; h++) {
//            String [] thongSo = sc.nextLine().split("\\s++");
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.nextLine().trim())-1;
            int [][] matrix = new int [n][m];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    matrix[i][j] = Integer.parseInt(sc.next());
                }
            }
            int [] sx = new int [n];
            for (int i=0; i<n; i++) {
                sx[i] = matrix[i][k];
            }
            for (int i=0; i<n-1; i++) {
                for (int j=i+1; j<n; j++) {
                    if (sx[i] > sx[j]) {
                        int tmp = sx[i];
                        sx[i] = sx[j];
                        sx[j] = tmp;
                    }
                    
                }
            }
            for (int i=0; i<n; i++) {
                matrix[i][k] =sx[i]; 
            }
           
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    System.out.print(matrix[i][j] + " ");
                } 
                System.out.println("");
            }
        }
    }
}
