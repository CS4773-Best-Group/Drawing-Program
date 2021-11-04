package Commands;

import Canvas.Canvas;
import Shapes.Shape;

import java.util.List;

public class SelectCommand implements Command {
    Canvas canvas;
    int selected;

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
            System.out.println("ERROR: invalid shape form SELECT");
        }
    }
}
