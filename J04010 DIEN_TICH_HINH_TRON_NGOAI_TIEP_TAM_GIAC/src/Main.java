
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
class Point {

    private double x, y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point scPoint) {
        return Math.sqrt(Math.pow(x - scPoint.x, 2) + Math.pow(y - scPoint.y, 2));
    }

    public double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ca = c.distance(a);
            if (ab + bc <= ca || bc + ca <= ab || ca + ab <= bc) {
                System.out.println("INVALID");
            } else {
                double S = Math.sqrt((ab + bc + ca) * (ab + bc - ca) * (bc + ca - ab) * (ca + ab - bc))/4;
                double R = (ab * bc * ca) / (4 * S);
                System.out.printf("%.3f\n",R*R*Math.PI);
            }
        }
    }
}
