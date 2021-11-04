package Handlers;

import Canvas.Canvas;

public class UndoHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public UndoHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("UNDO")) {
            // TODO: EXECUTE UNDO COMMAND ON THE CURRENT SELECTED SHAPE
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
