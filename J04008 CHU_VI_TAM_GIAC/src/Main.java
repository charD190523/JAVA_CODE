
import java.util.Scanner;
//
//public class Point {
//
//    double x;
//    double y;
//
//    public Point() {
//        this (0f, 0f);
//    }
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public Point(Point p) {
//        this.x = p.x;
//        this.y = p.y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public double distance(Point a) {
//        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
//    }
//
//    public double distance(Point a, Point b) {
//        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
//    }
//
//    public String toString() {
//        return x + " " + y;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            Point[] arr = new Point[3];
//            for (int i = 0; i < 3; i++) {
//                double x = sc.nextDouble();
//                double y = sc.nextDouble();
//                arr[i] = new Point(x, y);
//            }
//            double a = arr[0].distance(arr[1]);
//            double b = arr[1].distance(arr[2]);
//            double c = arr[0].distance(arr[2]);
//            if (a + b > c && b + c > a && c + a > b) {
//                System.out.printf("%.3f", a + b + c);
//            }
//            else System.out.println("INVALID");
//            if (p1.distance(p2) + p2.distance(p3) <= p1.distance(p3)) {
//                System.out.println("INVALID");
//            } else {
//                System.out.printf("%.3f",p1.distance(p2) + p2.distance(p3) + p1.distance(p3));
//            }
//        }
//
//    }
//}

class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(x - secondPoint.x, 2) + Math.pow(y - secondPoint.y, 2));
    }
    public double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

}

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b), bc = b.distance(c), ca = c.distance(a);
            if(ab + bc <= ca || bc + ca <= ab || ab + ca <= bc){
                System.out.println("INVALID");
            }else{
                System.out.printf("%.3f\n", ab + bc + ca);
            }
        }
    }
}
