package Commands;

import Canvas.Canvas;
import Shapes.Rectangle;

public class CreateRectangleCommand implements Command {
    Canvas canvas;
    int width, height;

    public CreateRectangleCommand(Canvas canvas, int width, int height) {
        this.canvas = canvas;
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        Rectangle rectangle = new Rectangle(width, height);
        canvas.addShapeToCanvas(rectangle);
        canvas.createMemento();
    }
}
