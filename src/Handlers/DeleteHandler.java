package Handlers;

import Canvas.Canvas;

public class DeleteHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public DeleteHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("DELETE")) {
            // TODO: EXECUTE DELETE COMMAND ON THE CURRENT SELECTED SHAPE
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
