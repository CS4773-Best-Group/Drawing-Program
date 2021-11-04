package Commands;

import Canvas.Canvas;

public class UndoCommand implements Command {
    Canvas canvas;

    public UndoCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        // TODO: IMPLEMENT MEMENTO STRATEGY AND UNDO TO LAST STATE
    }
}
