package Handlers;

import Canvas.Canvas;
import Commands.DeleteCommand;

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
            new DeleteCommand(canvas).execute();
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
