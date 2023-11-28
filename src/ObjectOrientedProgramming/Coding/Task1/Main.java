package ObjectOrientedProgramming.Coding.Task1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D1= new Point2D(1.5f, 10.8f);
        Point2D point2D2 = new Point3D(1.5f, 10.8f, 1f);

        Point3D point3D1 = new Point3D(1.1f, 4.4f, 3.1f);
        Point2D point3D2 = new Point3D(1.1f, 1.1f, 1f);

        System.out.println(point2D1);
        System.out.println(point2D2);
        System.out.println(point3D1);
        System.out.println(point3D2);
        System.out.println(Arrays.toString(point2D1.getXY()));
    }
}
