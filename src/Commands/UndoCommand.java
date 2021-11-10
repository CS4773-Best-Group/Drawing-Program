package Commands;

import Canvas.Canvas;

public class UndoCommand implements Command {
    Canvas canvas;

    public UndoCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
