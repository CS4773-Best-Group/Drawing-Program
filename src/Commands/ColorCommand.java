package Commands;

import Shapes.Shape;

public class ColorCommand implements Command {
    Shape shape;
    String color;

    public ColorCommand(Shape shape, String color) {
        this.shape = shape;
    }

    @Override
    public void execute() {
        shape.color(color);
    }
}
