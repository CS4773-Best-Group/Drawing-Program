package Handlers;

import Canvas.Canvas;

public class FinalHandler implements Handler {
    Canvas canvas;

    public FinalHandler(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        System.out.println("Command not found.");
    }
}
