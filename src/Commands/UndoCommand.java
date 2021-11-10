package Commands;

import Canvas.Canvas;

public class UndoCommand implements Command {
    Canvas canvas;

    public UndoCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
//        canvas.restoreMemento();
    }

    @Override
    public void undo() {

    }
}
