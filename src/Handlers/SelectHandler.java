package Handlers;

import Canvas.Canvas;

public class SelectHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public SelectHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("SELECT")) {
            // TODO: EXECUTE SELECT COMMAND
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
