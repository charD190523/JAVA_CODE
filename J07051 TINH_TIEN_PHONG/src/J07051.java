
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

    
class Room implements Comparable<Room>{
    private String code,name, roomID;
    private int duration, dv, totalCost;
    
    public Room (String code, String name, String roomID, int duration, int dv) {
        this.code = code;
        this.name = name;
        this.roomID = roomID;
        this.duration = duration;
        this.dv = dv;
    }
    
    public Integer getToTalCost() {
        return totalCost;
    }
    
    public void tinhTien () {
        int giaTang = 0;
        switch (roomID.substring(0,1)) {
            case "1" :
                giaTang = 25;
                break;
            case "2":
                giaTang = 34;
                break;
            case "3" :
                giaTang = 50;
                break;
            case "4" :
                giaTang = 80;
                break;
        }
//        System.out.println("tang: " + roomID.substring(0,1));
//        System.out.println("dv = " + dv);
        totalCost = giaTang * duration + dv;
    }
    
    public void chuanHoa () {
        String [] ten = name.split("\\s++");
        String res = "";
        for (int i=0; i<ten.length; i++) {
            res += ten[i].substring(0,1).toUpperCase() + ten[i].substring(1).toLowerCase();
            res += " ";
        }
        res = res.trim();
        name = res;
    }
    
    @Override
    public String toString () {
        return code + " " + name + " " + roomID + " " + duration + " " + totalCost;
    }
    
    
    @Override
    public int compareTo(Room o) {
        return -(this.getToTalCost().compareTo(o.getToTalCost()));
    }
}
public class J07051 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner (new File ("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        Room [] room = new Room [n];
        for (int i=1; i<=n; i++) {
            String code = "KH" + String.format("%02d", i);
            String name = sc.nextLine().trim();
            String roomID = sc.nextLine().trim();
            Date checkIn = sdf.parse(sc.nextLine());
            Date checkOut = sdf.parse(sc.nextLine());
            int duration = (int) ((checkOut.getTime()-checkIn.getTime())/(1000*60*60*24)+1);
            int dv = Integer.parseInt(sc.nextLine());
            room[i-1] = new Room (code, name, roomID, duration, dv);
            room[i-1].chuanHoa();
            room[i-1].tinhTien();
        }
        Arrays.sort(room);
        for (Room x : room) {
            System.out.println(x);
        }
    }
}
