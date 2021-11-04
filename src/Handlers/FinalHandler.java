package Handlers;

import Canvas.Canvas;

public class FinalHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public FinalHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        System.out.println("Command not found.");
    }
}
