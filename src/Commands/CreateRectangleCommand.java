package Commands;

import Canvas.Canvas;
import Shapes.Rectangle;

public class CreateRectangleCommand implements Command {
    Canvas canvas;
    int width, height;
    int prevWidth, prevHeight;

    public CreateRectangleCommand(Canvas canvas, int width, int height) {
        this.canvas = canvas;
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        Rectangle rectangle = new Rectangle(width, height);
        prevWidth = rectangle.getHeight();
        prevHeight = rectangle.getWidth();
        canvas.addShapeToCanvas(rectangle);
        canvas.createMemento();
    }

    @Override
    public void undo() {
        Rectangle rectangle = new Rectangle(prevWidth, prevHeight);
        canvas.addShapeToCanvas(rectangle);
        canvas.createMemento();

    }
}
