package Handlers;

import Canvas.Canvas;
import Commands.UndoCommand;
import Memento.CareTaker;

public class UndoHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public UndoHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        //System.out.println(command[0]);
        if (command[0].equals("UNDO")) {
            new UndoCommand(canvas).execute();
            CareTaker.loadMemento().getCommand().undo();
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
