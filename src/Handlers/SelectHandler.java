package Handlers;

import Canvas.Canvas;
import Commands.SelectCommand;

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
            int selected = Integer.parseInt(command[1]);
            new SelectCommand(canvas, selected).execute();
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
