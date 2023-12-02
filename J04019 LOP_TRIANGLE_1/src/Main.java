
import java.util.Scanner;

class Point {
    private double a, b;
    
    public Point (double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getX () {
        return a;
    }
    
    public double getY () {
        return b;
    }
    
    public static Point nextPoint (Scanner sc) {
        Point p = new Point (1,1);
        p.a = sc.nextDouble();
        p.b = sc.nextDouble();
        return p;
    } 
}

class Triangle {
    private Point a, b, c;
    
    public Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double distance (Point x, Point y) {
        return Math.sqrt(Math.pow(x.getX()-y.getY(),2) + Math.pow(x.getY() - y.getY(), 2));
    }
    
    public boolean valid () {
        double ab = distance(a,b);
        double bc = distance(b,c);
        double ca = distance(c,a);
        
        if (ab + bc <= ca || bc + ca <=ab || ca + ab <= bc) {
            return false;
        }
        return true;
    }
    
    public String getPerimeter() {
        double ab = distance(a,b);
        double bc = distance(b,c);
        double ca = distance(c,a);
        return String.format("%.3f", ab + bc + ca);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
