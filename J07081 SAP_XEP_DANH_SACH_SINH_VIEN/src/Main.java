
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


//class SV implements Comparable<SV>{
//    private String code, name, sdt, email, ten;
//
//    public SV(String code, String name, String sdt, String email) {
//        this.code = code;
//        this.name = name;
//        this.sdt = sdt;
//        this.email = email;
//        ten = name.split("\\s++")[2] + name.split("\\s++")[0] + name.split("\\s++")[1];
//    }
//    
//    public String getCode () {
//        return this.code;
//    }
//    
//    public String getName () {
//        return this.name;
//    }
//    
//    public String toString () {
//        return code + " " + name + " " + sdt + " " + email;
//    } 
//
//    @Override
//    public int compareTo(SV o) {
////        if (ten.equals(o.getTen())) return code.compareTo(o.getCode());
////        return ten.compareTo(o.getTen());
//        String [] ten1 = this.name.split("\\s++");
//        String [] ten2 = o.getName ().split("\\s++");
//        
//        String lastName1 = ten1[2];
//        String lastName2 = ten2[2];
//        int lastNameCompare = lastName1.compareTo(lastName2);
//        if (lastNameCompare == 0) {
//            String firstName1 = ten1[0];
//            String firstName2 = ten2[0];
//            String middleName1 = ten1[1];
//            String middleName2 = ten2[1];
//            
//            int firstNameCompare = firstName1.compareTo(firstName2);
//            if (firstNameCompare == 0) {
//                int middleNameCompare = middleName1.compareTo(middleName2);
//                if (middleNameCompare == 0) return this.code.compareTo(o.getCode());
//                return middleNameCompare;
//            }
//            return firstNameCompare;
//        }
//        return lastNameCompare;
//    }
//}
//
//public class SXSV {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner (new File ("SINHVIEN.in"));
//        int n = Integer.parseInt(sc.nextLine());
//        
//        SV [] sv = new SV [n];
//        
//        for (int i=0; i<n; i++) {
//            String code = sc.nextLine();
//            String name = sc.nextLine();
//            String sdt = sc.nextLine();
//            String email = sc.nextLine();
//            
//            sv[i] = new SV (code, name, sdt, email);
//        }
//        Arrays.sort(sv);
//        for (SV x : sv) {
//            System.out.println(x);
//        }
//    }
//}

class Student implements Comparable<Student>{
    private String studentID;
    private String studentName;
    private String studentPhoneNumber;
    private String studentEmail;
    private String studentFinalName;

    public Student(String studentID, String studentName, String studentPhoneNumber, String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentEmail = studentEmail;
        String[] word = studentName.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String x : word){
            sb = new StringBuilder(x);
        }
        this.studentFinalName = sb.toString();
    }

    @Override
    public String toString() {
        return studentID + " " + studentName + " " + studentPhoneNumber + " " + studentEmail;
    }

    @Override
    public int compareTo(Student o) {
        if(!this.studentFinalName.equals(o.studentFinalName))
            return this.studentFinalName.compareTo(o.studentFinalName);
        if(!this.studentName.equals(o.studentName))
            return this.studentName.compareTo(o.studentName);
        return this.studentID.compareTo(o.studentID);
    }
}

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Student x : list){
            System.out.println(x);
        }
    }
}