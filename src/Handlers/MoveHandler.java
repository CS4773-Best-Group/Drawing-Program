package Handlers;

import Canvas.Canvas;

public class MoveHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public MoveHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("MOVE")) {
            // TODO: EXECUTE MOVE COMMAND ON THE CURRENT SELECTED SHAPE
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
