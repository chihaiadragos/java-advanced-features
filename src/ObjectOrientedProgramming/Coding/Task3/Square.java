package ObjectOrientedProgramming.Coding.Task3;

public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled, side, side);
    }

    @Override
    public double getPerimeter() {
        return this.width * 4;
    }

    @Override
    public double getArea() {
        return this.width * this.width;

    }

    @Override
    public String toString() {

        return "Square with side equals to "
                + this.width
                + " wich is a subclass of "
                + super.toString();
    }
}

