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
            // TODO: finish
            int selected = Integer.parseInt(command[1]);
            // new DeleteCommand(canvas, selected).execute();
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
