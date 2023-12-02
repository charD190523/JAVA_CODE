
import java.util.Scanner;


public class DAY_NGOAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String [] a = {"(","[","{","}","]",")"};
            int check = 1; // ktra cnt le hay chan
            int ktra = 1; // kiem tra so luong 2 ngoac nguoc nhau cua 1 cap co bang nhau k
            for (int i=0; i<s.length()-1; i++) {
                int tmp = 0;
                int res = 0;
                for (int j = 0; j<a.length; j++) {
                    if (a[j].equals(String.valueOf(s.charAt(i)))) {
                        res = j;
//                        System.out.println(res);
                        break;
                    }
                }
//                System.out.println(res);

                // so luong 2 loai ngoac nguoc nhau
                int cnt1 = 0;
                int cnt2 = 0;
                for (int j=0; j<s.length(); j++) {
                    if (a[res].equals(String.valueOf(s.charAt(j)))) cnt1++;
                    if (a[a.length-res-1].equals(String.valueOf(s.charAt(j)))) cnt2++;
                }
                if (cnt1 != cnt2) ktra = 0;
                if (ktra ==0) {
                    System.out.println("NO");
                    break;
                }
                else {
                    //Neu la ngoac nguoc thi bo qua
                    if (res > 2 ) continue;
                    int cnt = 1;
                    for (int j = i+1; j<s.length(); j++) {
                        // dem do dai xau dang xet
                        cnt ++;
//                        System.out.println(s.charAt(j) + " " + a[a.length-res-1]);
//                        System.out.println(cnt + " " + tmp);
                        
                        // Neu co 2 ngoac xuoi giong nhau thi tang tmp len
                        if (s.charAt(i) == s.charAt(j)) {
                            tmp ++;
                        }
                        
                        // Neu gap ngoac nguoc tuong ung voi ngoac xuoi thi giam tmp di
                        if (a[a.length-res-1].equals(String.valueOf(s.charAt(j))) && tmp > 0 ) {
                            tmp--;
                        }
                        else if (a[a.length-res-1].equals(String.valueOf(s.charAt(j))) && tmp == 0) {
                            if (cnt % 2 != 0) {
                                System.out.println("NO");
                                check = 0;
                                break;
                            } else {
                                cnt = 1;
                                break;
                            }
                        }
                        if (check == 0) break;
                    }
                }
                if (check == 0) break;
            }
            if (check == 1) System.out.println("YES");
        }
    }
}
