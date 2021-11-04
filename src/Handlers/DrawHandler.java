package Handlers;

import Canvas.Canvas;
import Commands.DrawCommand;

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
            new DrawCommand(canvas).execute();
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
