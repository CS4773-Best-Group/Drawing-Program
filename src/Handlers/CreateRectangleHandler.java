package Handlers;

import Canvas.Canvas;
import Commands.Command;
import Commands.CreateRectangleCommand;
import Shapes.Shape;

public class CreateRectangleHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public CreateRectangleHandler(Canvas canvas, Handler nextHandler) {
        this.canvas = canvas;
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("CREATE") && command[1].equals("RECTANGLE")) {
            int width = Integer.parseInt(command[2]);
            int height = Integer.parseInt(command[3]);
            Command createRectangleCommand = new CreateRectangleCommand(
                canvas, width, height);
            createRectangleCommand.execute();
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
