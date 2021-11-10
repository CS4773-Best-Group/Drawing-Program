package Handlers;

import Canvas.Canvas;
import Commands.Command;
import Commands.MoveCommand;
import Memento.CareTaker;
import Memento.Memento;

public class MoveHandler implements Handler {
    Handler nextHandler;
    Canvas canvas;

    public MoveHandler(Handler nextHandler, Canvas canvas) {
        this.nextHandler = nextHandler;
        this.canvas = canvas;
    }

    @Override
    public void handleRequest(String[] command) {
        if (command[0].equals("MOVE")) {
            int x = Integer.parseInt(command[1]);
            int y = Integer.parseInt(command[2]);
            Command moveCommand = new MoveCommand(canvas, x, y);
            moveCommand.execute();
            CareTaker.saveMemento(new Memento(moveCommand));
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
