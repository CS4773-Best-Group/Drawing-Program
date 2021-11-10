package Handlers;

import Canvas.Canvas;
import Commands.Command;
import Commands.DeleteCommand;
import Memento.CareTaker;
import Memento.Memento;

public class DeleteHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public DeleteHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("DELETE")) {
            Command deleteCommand = new DeleteCommand(canvas);
            deleteCommand.execute();
            CareTaker.saveMemento(new Memento(deleteCommand));
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
