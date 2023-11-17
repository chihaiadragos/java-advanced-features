package ObjectOrientedProgramming.Coding.Task3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", true, 5);
        Rectangle rectangle = new Rectangle("blue", false, 2, 3);
        Square square = new Square("white", false, 4.3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}

