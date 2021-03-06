package Handlers;

import Canvas.Canvas;
import Commands.Command;
import Commands.CreateRectangleCommand;
import Memento.CareTaker;
import Memento.Memento;

public class CreateRectangleHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public CreateRectangleHandler(Handler nextHandler, Canvas canvas) {
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
            CareTaker.saveMemento(new Memento(createRectangleCommand));
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
