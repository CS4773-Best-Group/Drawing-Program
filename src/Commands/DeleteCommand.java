package Commands;

import Canvas.Canvas;
import Shapes.Shape;

import java.util.List;

public class DeleteCommand implements Command {
    Canvas canvas;

    public DeleteCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        int selected = canvas.getShapeSelected();
        List<Shape> shapes = canvas.getShapes();
        if (selected > 0){
            Shape selectedShape = shapes.get(selected - 1);
            shapes.remove(selectedShape);
            canvas.createMemento();
        } else {
            System.out.println("no shape selected.");
        }
    }
}
