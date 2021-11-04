package Handlers;

import Canvas.Canvas;

public class ColorHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public ColorHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("COLOR")) {
            // TODO: EXECUTE COLOR COMMAND ON THE CURRENT SELECTED SHAPE
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
