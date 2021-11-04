package Commands;

import Canvas.Canvas;
import Shapes.Shape;

import java.util.List;

public class DrawsceneCommand implements Command {
    Canvas canvas;

    public DrawsceneCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        List<Shape> shapes = canvas.getShapes();
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
