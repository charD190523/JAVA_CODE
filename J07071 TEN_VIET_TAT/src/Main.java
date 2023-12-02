
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//class NameComparator implements Comparator<String> {
//    public int compare (String a, String b) {
//        String nameA = a.split("\\s++")[2] + " " + a.split("\\s++")[1] + " " + a.split("\\s++")[0];
//        String nameB = b.split("\\s++")[2] + " " + b.split("\\s++")[1] + " " + b.split("\\s++")[0];
//        return nameA.compareTo(nameB);
//    }

//    @Override
//    public int compareTo(String o) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}
 
//public class Name {
//
//
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("DANHSACH.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        List<String> print = new ArrayList<>();
//        String[] ds = new String[n];
//        for (int i = 0; i < n; i++) {
//            ds[i] = sc.nextLine();
//        }
//        int t = Integer.parseInt(sc.nextLine());
//        String[] ds1 = new String[t];
//        for (int i = 0; i < t; i++) {
//            ds1[i] = sc.nextLine();
//        }
//        for (int i = 0; i < ds.length; i++) {
//            for (int j = 0; j < ds1.length; j++) {
//                String[] ten = ds[i].split("\\s++");
//                String[] vt = ds1[j].split("\\.");
//                int check = 1;
//                int cnt = 0;
//                while (cnt < ten.length && cnt < vt.length) {
//                    if (vt[cnt].equals("*")) {
//                        cnt++;
//                        continue;
//                    }
//                    if (!vt[cnt].equals(ten[cnt].subSequence(0, 1))) {
//                        check = 0;
//                        break;
//                    }
//                    cnt++;
//                }
//                if (check == 1) {
//                    print.add(ds[i]);
//                    break;
//                }
//            }
//        }
//
//        Collections.sort(print, new NameComparator());
//        for (String x : print) {
//            System.out.println(x);
//        }
//    }
//}
//class NameComparator implements Comparator<String> {
//    @Override
//    public int compare(String a, String b) {
//        String[] nameA = a.split("\\s++");
//        String[] nameB = b.split("\\s++");
//
//        // So sánh tên cuối cùng (hoặc tên đầu tiên nếu bạn muốn sắp xếp theo tên đầu tiên)
//        int tenCompare = nameA[nameA.length - 1].compareTo(nameB[nameB.length - 1]);
//        if (tenCompare == 0) {
//            int demCompare = nameA[0].compareTo(nameB[0]);
//            if (demCompare == 0) {
//                int hoCompare = nameA[1].compareTo(nameB[1]);
//                return hoCompare;
//            }
//            return demCompare;
//        }
//        return tenCompare;
//    }
//}

class Name implements Comparable<Name>{
    private String name;
    private String nickName;
    private String ten, ho;

    public Name(String name) {
        this.name = name;
        String[] s = name.split("\\s+");
        nickName = "";
        for (int i = 0; i < s.length - 1; ++i)
            nickName += String.valueOf(s[i].charAt(0) + ".");
        ten = s[s.length - 1];
        ho = s[0];
        nickName += String.valueOf(ten.charAt(0));
    }

    public boolean compare(String s){
        if(s.length() != nickName.length())return false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*')
                continue;
            if(s.charAt(i) != nickName.charAt(i))
                return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name o) {
        if(!ten.equals(o.ten))
            return ten.compareTo(o.ten);
        return ho.compareTo(o.ho);
    }
}
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Name> list = new ArrayList<>();
        while(n-- != 0){
            list.add(new Name(sc.nextLine()));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String s = sc.nextLine();
            for(Name x : list){
                if(x.compare(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
