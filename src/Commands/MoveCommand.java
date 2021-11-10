package Commands;

import Canvas.Canvas;
import Shapes.Shape;

import java.util.List;

public class MoveCommand implements Command {
    Canvas canvas;
    int x;
    int y;
    int prevX;
    int prevY;
    Shape selectedShape;

    public MoveCommand(Canvas canvas, int x, int y) {
        this.canvas = canvas;
        this.x = x;
        this.y = y;
        this.selectedShape = null;
    }

    @Override
    public void execute() {
        int selected = canvas.getShapeSelected();
        List<Shape> shapes = canvas.getShapes();
        if (selected > 0){
            selectedShape = shapes.get(selected - 1);
            prevX = selectedShape.getX();
            prevY = selectedShape.getY();
            selectedShape.move(x, y);
        } else {
            System.out.println("no shape selected.");
        }
    }

    @Override
    public void undo() {
        if (selectedShape != null){
            selectedShape.move(prevX, prevY);
        } else {
            System.out.println("no shape selected.");
        }
    }
}
