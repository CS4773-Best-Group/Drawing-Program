package Shapes;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
        this.x = 0;
        this.y = 0;
        this.color = "Blue";

        drawingStrategy = new DrawCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
