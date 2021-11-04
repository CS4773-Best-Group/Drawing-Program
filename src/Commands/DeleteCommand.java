package Commands;

import Shapes.Shape;

public class DeleteCommand implements Command {
    Shape shape;

    public DeleteCommand(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void execute() {
    }
}
