package Commands;

import Canvas.Canvas;
import Shapes.Shape;

import java.util.List;

public class DeleteCommand implements Command {
    Canvas canvas;
    private Shape selectedShape;

    public DeleteCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        int selected = canvas.getShapeSelected();
        List<Shape> shapes = canvas.getShapes();
        if (selected > 0){
            selectedShape = shapes.get(selected - 1);
            shapes.remove(selectedShape);
        } else {
            System.out.println("no shape selected.");
        }
    }

    @Override
    public void undo() {
        canvas.addShapeToCanvas(selectedShape);
    }
}
