
import java.util.Scanner;

class Point {
    private double x, y;
    
    public Point () {
        
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX () {
        return x;
    }
    
    public double getY () {
        return y;
    }
    
    public double distance (Point scPoint) {
        return Math.sqrt(Math.pow(x - scPoint.x,2) + Math.pow(y - scPoint.y,2));
    }
    
    public double distance (Point a, Point b) {
        return Math.sqrt (Math.pow(a.x-b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}

public class DIEN_TICH {
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
                System.out.printf("%.2f\n", Math.sqrt((ab + bc + ca) * (ab + bc - ca) * ( - ab + bc + ca) * ( ab - bc + ca)) / 4);
            }
        }
    }
}
