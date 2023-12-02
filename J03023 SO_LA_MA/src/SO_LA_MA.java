
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SO_LA_MA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            List<Integer> list = new ArrayList<>();
            for (char x : s.toCharArray()) {
                switch (x) {
                    case 'I':
                        list.add(1);
                        break;
                    case 'V':
                        list.add(5);
                        break;
                    case 'X':
                        list.add(10);
                        break;
                    case 'L':
                        list.add(50);
                        break;
                    case 'C':
                        list.add(100);
                        break;
                    case 'D':
                        list.add(500);
                        break;
                    case 'M':
                        list.add(1000);
                        break;
                }

            }
            int num = list.get(list.size() - 1);
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    num -= list.get(i);
                } else {
                    num += list.get(i);
                }
            }
            System.out.println(num);
        }
    }
}
