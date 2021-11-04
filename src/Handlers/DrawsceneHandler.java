package Handlers;

import Canvas.Canvas;

public class DrawsceneHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public DrawsceneHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("DRAWSCENE")) {
            // TODO: EXECUTE DRAWSCENE COMMAND USING LIST OF SHAPES
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
