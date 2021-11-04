package Commands;

import Canvas.Canvas;
import Shapes.Shape;

import java.util.List;

public class DrawCommand implements Command {
    Canvas canvas;

    public DrawCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        int selected = canvas.getShapeSelected();
        List<Shape> shapes = canvas.getShapes();
        if (selected > 0){
            Shape selectedShape = shapes.get(selected - 1);
            selectedShape.draw();
        } else {
            System.out.println("no shape selected.");
        }
    }
}
