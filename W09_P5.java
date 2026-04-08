
    import java.util.Scanner;

public class W09_P5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print(p1.distance(p2));

        sc.close();
    }
}

// Point class
class Point {

    private double x;
    private double y;

    public Point(double x, double y) {

        this.x = x;// this keyword is used to refer to the current object
        this.y = y;

    }

    public double distance(Point p2) {

        double dist;

        dist = Math.sqrt(
                Math.pow(this.x - p2.x, 2) +
                Math.pow(this.y - p2.y, 2)
        );

        return dist;
    }
}
    

