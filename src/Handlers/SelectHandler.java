package Handlers;

import Canvas.Canvas;
import Commands.Command;
import Commands.SelectCommand;
import Memento.CareTaker;
import Memento.Memento;

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
            Command selectCommand = new SelectCommand(canvas, selected);
            selectCommand.execute();
            CareTaker.saveMemento(new Memento(selectCommand));
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
