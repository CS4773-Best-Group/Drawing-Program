package Handlers;

import Canvas.Canvas;
import Commands.UndoCommand;

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
            new UndoCommand(canvas).execute();
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
