package ObjectOrientedProgramming.Coding.Task7;

public class ResizableCircle implements Resizable{
    private Circle circle;

    public ResizableCircle(Circle circle) {
        this.circle = circle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void resize(double percent) {
        circle.setRadius(circle.getRadius() + circle.getRadius()/100 * percent);
    }
}
