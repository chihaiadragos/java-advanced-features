package ObjectOrientedProgramming.Coding.Task3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle with width of "
                + this.width
                + " and lenght of "
                + this.length
                + " which is a subclass of "
                + super.toString();
    }
}

