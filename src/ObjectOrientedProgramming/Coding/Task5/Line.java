package ObjectOrientedProgramming.Coding.Task5;

public class Line {
    private Point2D point1 = new Point2D();
    private Point2D point2 = new Point2D();

    public Line(Point2D beginPoint, Point2D endPoint) {
        this.point1 = beginPoint;
        this.point2 = endPoint;
    }

    public Line(float x1, float y1, float x2, float y2) {
        this.point1.setXY(x1, y1);
        this.point2.setXY(x2, y2);
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public double lineLength() {
        return Math.hypot(Math.abs(point2.getY() - point1.getY()), Math.abs(point2.getX() - point1.getX()));
    }

    public Point2D centerLinePoint() {
        return new Point2D((point1.getX() + point2.getX()) / 2, (point1.getY() + point2.getY()) / 2);
    }
}

