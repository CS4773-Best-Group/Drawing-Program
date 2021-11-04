package Handlers;

import Canvas.Canvas;
import Commands.ColorCommand;

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
            String color = command[1];
            new ColorCommand(canvas, color).execute();
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
