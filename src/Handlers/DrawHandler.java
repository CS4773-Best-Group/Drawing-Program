package Handlers;

import Canvas.Canvas;
import Commands.Command;
import Commands.DrawCommand;
import Memento.CareTaker;
import Memento.Memento;

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
            Command drawCommand = new DrawCommand(canvas);
            drawCommand.execute();
            CareTaker.saveMemento(new Memento(drawCommand));
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
