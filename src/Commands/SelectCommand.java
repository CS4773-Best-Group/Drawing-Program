package Commands;

import Canvas.Canvas;
import Shapes.Shape;

import java.util.List;

public class SelectCommand implements Command {
    Canvas canvas;
    int selected;
    int prevSelected;

    public SelectCommand(Canvas canvas, int selected) {
        this.canvas = canvas;
        this.selected = selected;
    }

    @Override
    public void execute() {
        canvas.setShapeSelected(selected);
        List<Shape> shapes = canvas.getShapes();
        if (selected > 0 && selected <= shapes.size()){
            canvas.setShapeSelected(selected);
        } else {
            System.out.println("ERROR: invalid shape for SELECT");
        }
    }

    @Override
    public void undo() {
        canvas.setShapeSelected(prevSelected);
        List<Shape> shapes = canvas.getShapes();
        if (prevSelected > 0 && prevSelected <= shapes.size()){
            canvas.setShapeSelected(prevSelected);
        } else {
            System.out.println("ERROR: invalid shape for SELECT");
        }

    }
}
