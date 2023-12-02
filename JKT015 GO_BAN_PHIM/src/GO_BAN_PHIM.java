// TLE
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GO_BAN_PHIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        List <Character> list = new ArrayList <>();
        int j = 0;
        for (int i=0; i<s.length(); i++) {
//            System.out.println(s.charAt(i) + " " + j + " " + list);
            switch (s.charAt(i)) {
                case '<' :
                    j--;
                    if (j < 0) j = 0;
                    break;
                case '>' :
                    j++;
                    if (j >= list.size()) j = list.size();
                    break;
                case '-' :
                    if (j == 0) break;
                    list.remove(j-1);
                    j--;
                    break;
                default :
                    list.add (j, s.charAt(i));
                    j++;
                    break;
            }
        }
        for (Character x : list) {
            System.out.print(x);
        } 
//        for (int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
}
