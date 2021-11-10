package Handlers;

import Canvas.Canvas;
import Commands.ColorCommand;
import Commands.Command;
import Memento.CareTaker;
import Memento.Memento;

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
            Command colorCommand = new ColorCommand(canvas, color);
            colorCommand.execute();
            CareTaker.saveMemento(new Memento(colorCommand));
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
