import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Xau s = new Xau();
        Matran m = new Matran () ;
        boolean dung = false;
        while (true) {
            System.out.println("1. Nhap vao xau:");
            System.out.println("2.Kiem tra MSV");
            System.out.println("3.Tach cac tu trong xau");
            System.out.println("4.Chuan hoa doan van ban");
            System.out.println("5.Nhap vao 1 ma tran chu nhat A");
            System.out.println("6. Viet ra ma tran chuyen vi cua A");
            System.out.println("7. Dua cac hang chi co cac so nguyen to");
            System.out.println("8. Nhap vao x va elipson");
            System.out.println("9.Tinh");
            System.out.println("0. Thoat");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    s.inp();
                    break;
                case 2:
//                    s.oup();
                    s.kiemTra();
                    break;
                case 3: 
                    s.tachXau();
                    break;
                case 5:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    m = new Matran (a,b);
                    m.input();
                    break;
                case 6:
                    m.chuyenVi();
                    break;
                case 7:
                    m.printNT();
                case 0:
                    dung = true;
                    break;
                default:
                    System.out.println("Xin moi nhap lai: ");
                    break;
            }
            if (dung) break;
        }
    }
}
