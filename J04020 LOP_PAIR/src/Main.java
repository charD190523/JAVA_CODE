
import java.util.Scanner;

public class Main {

    static class Pair<F, S> {

        private F first;
        private S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        private boolean check(Integer n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        
        public boolean isPrime () {
            return check((Integer) first) && check((Integer) second);
        }
        
        public String toString () {
            return first + " " + second;
        }
    } 

//    public static int check(int n) {
//        if (n < 2) {
//            return 0;
//        }
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) {
//                return 0;
//            }
//        }
//        return 1;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
