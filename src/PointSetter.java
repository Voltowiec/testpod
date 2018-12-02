import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {

        Point location = new Point(4, 13);

        System.out.println("Położenie początkowe:");
        System.out.println("X równe " + location.x);
        System.out.println("Y równe " + location.y);

        System.out.println("Przejście do (7,6)");
        location.x = 7;
        location.y = 6;

        System.out.println("Położenie końcowe:");
        show(location);

        System.out.println("X równe " + location.x);
        System.out.println("Y równe " + location.y);

    }

    static void show (Point point) {
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);

    }

    static void show (Point point, String desc) {
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);
    }
    static void changePoint (Point point, int x, int y, String desc) {
        System.out.println();
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);
    }

}
