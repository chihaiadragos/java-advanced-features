package ObjectOrientedProgramming.Coding.Task6;

public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);
        movablePoint.moveUp();
        movablePoint.moveRight();
        movablePoint.moveRight();

        System.out.println(movablePoint.getX());
        System.out.println(movablePoint.getY());
        System.out.println("__________________________________");

        MovableCircle movableCircle = new MovableCircle(3, movablePoint);
        System.out.println(movableCircle.getCenter().getX());
        System.out.println(movableCircle.getCenter().getY());
        System.out.println(movableCircle.getRadius());
        System.out.println("__________________________________");

        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movableCircle.getCenter().getX());
        System.out.println(movableCircle.getCenter().getY());
    }
}
