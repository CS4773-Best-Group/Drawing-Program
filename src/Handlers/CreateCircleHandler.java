package Handlers;

import Canvas.Canvas;
import Commands.ColorCommand;
import Commands.Command;
import Commands.CreateCircleCommand;
import Commands.CreateRectangleCommand;
import Memento.CareTaker;
import Memento.Memento;

public class CreateCircleHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public CreateCircleHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("CREATE") && command[1].equals("CIRCLE")) {
            int radius = Integer.parseInt(command[2]);
            Command createCircleCommand = new CreateCircleCommand(canvas, radius);
            createCircleCommand.execute();
            CareTaker.saveMemento(new Memento(createCircleCommand));
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
