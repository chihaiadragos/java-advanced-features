package ObjectOrientedProgramming.Coding.Task7;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(100);
        ResizableCircle resizableCircle = new ResizableCircle(circle);

        System.out.println(circle.getRadius());
        resizableCircle.resize(10);
        System.out.println(circle.getRadius());

    }

}
