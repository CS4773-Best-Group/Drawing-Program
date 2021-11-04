package Commands;

import Canvas.Canvas;
import Shapes.Shape;

import java.util.List;

public class ColorCommand implements Command {
    Canvas canvas;
    String color;

    public ColorCommand(Canvas canvas, String color) {
        this.canvas = canvas;
        this.color = color;
    }

    @Override
    public void execute() {
        int selected = canvas.getShapeSelected();
        List<Shape> shapes = canvas.getShapes();
        if (selected > 0){
            Shape selectedShape = shapes.get(selected - 1);
            selectedShape.color(color);
            canvas.createMemento();
        } else {
            System.out.println("no shape selected.");
        }
    }
}
