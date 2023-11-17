package ObjectOrientedProgramming.Coding.Task4;

public class Rectangle extends Shape {
    private double width;
    private double lenght;

    public Rectangle() {
        super();
        this.width = 1;
        this.lenght = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double lenght) {
        super(color, isFilled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return this.width * this.lenght;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.width + 2 * this.lenght;
    }

    @Override
    public String toString() {
        return "Rectangle with width of "
                + this.width
                + " and lenght of "
                + this.lenght
                + " which is a subclass of "
                + super.toString();
    }
}

