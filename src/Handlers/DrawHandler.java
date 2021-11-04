package Handlers;

import Canvas.Canvas;

public class DrawHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public DrawHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("DRAW")) {
            // TODO: EXECUTE DRAW COMMAND ON THE CURRENT SELECTED SHAPE
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
