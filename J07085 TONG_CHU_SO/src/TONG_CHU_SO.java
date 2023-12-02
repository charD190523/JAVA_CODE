
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TONG_CHU_SO {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        for (String x : list) {
            long n = 0;
            long sum = 0;
            for (int i = 0; i < x.length(); i++) {
                try {
                    n = n * 10 + Long.parseLong(String.valueOf(x.charAt(i)));
                    sum += Long.parseLong(String.valueOf(x.charAt(i)));
                } catch (Exception e) {

                }
            }
            System.out.println(n + " " + sum);
        }
    }
}
