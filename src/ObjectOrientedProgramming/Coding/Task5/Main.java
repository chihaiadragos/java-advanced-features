package ObjectOrientedProgramming.Coding.Task5;

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
        System.out.println("____________________________");

        Point2D pointStart = new Point2D(1f, 1f);
        Point2D pointEnd = new Point2D(4f, 4f);
        Line line = new Line(pointStart, pointEnd);

        System.out.println(line.lineLength());
        System.out.println(line.centerLinePoint());
    }
}

