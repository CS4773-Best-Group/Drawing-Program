package Shapes;

public class DrawCircle implements DrawingStrategy {
    Circle circle;

    public DrawCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void draw() {
        System.out.printf("Circle, " +
            "Color: %sOrigin: (%d,%d), Radius: %d%n",
            circle.color, circle.x, circle.y, circle.getRadius()
        );
    }
}
