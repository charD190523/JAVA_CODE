
import java.util.Scanner;

public class Rectange {

    double width;
    double height;
    String color;

    public Rectange() {
        width = 0;
        height = 0;
        color = "";
    }

    public Rectange(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return height * width;
    }

    public double findPerimeter() {
        return (height + width) * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextDouble();
        double rong = sc.nextDouble();
//        sc.nextLine();
        String mau = sc.nextLine().trim();
//        System.out.println(mau);
//        String s = mau.substring(0,1).toUpperCase() + mau.substring(1).toLowerCase();
        if (dai > 0 && rong > 0) {
            Rectange a = new Rectange(dai, rong, mau);
            System.out.printf("%.0f %.0f %s ", a.findPerimeter(), a.findArea(), a.getColor());
        }
        else System.out.println("INVALID");
    }
}
