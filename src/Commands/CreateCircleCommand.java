package Commands;

import Canvas.Canvas;
import Shapes.Circle;

public class CreateCircleCommand implements Command {
    Canvas canvas;
    int radius;
    int prevRadius;

    public CreateCircleCommand(Canvas canvas, int radius) {
        this.canvas = canvas;
        this.radius = radius;
    }

    @Override
    public void execute() {
        Circle circle = new Circle(radius);
        prevRadius = circle.getRadius();
        canvas.addShapeToCanvas(circle);
        canvas.createMemento();
    }

    @Override
    public void undo() {
        Circle circle = new Circle(prevRadius);
        canvas.addShapeToCanvas(circle);
        canvas.createMemento();
    }
}
