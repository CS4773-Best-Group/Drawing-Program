package Commands;

import Canvas.Canvas;
import Shapes.Circle;

public class CreateCircleCommand implements Command {
    Canvas canvas;
    int radius;

    public CreateCircleCommand(Canvas canvas, int radius) {
        this.canvas = canvas;
        this.radius = radius;
    }

    @Override
    public void execute() {
        Circle circle = new Circle(radius);
        canvas.addShapeToCanvas(circle);
    }
}
