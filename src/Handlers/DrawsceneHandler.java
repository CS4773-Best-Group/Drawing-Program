package Handlers;

import Canvas.Canvas;
import Commands.Command;
import Commands.DrawsceneCommand;
import Memento.CareTaker;
import Memento.Memento;

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
            Command drawsceneCommand = new DrawsceneCommand(canvas);
            drawsceneCommand.execute();
            CareTaker.saveMemento(new Memento(drawsceneCommand));
        } else {
            nextHandler.handleRequest(command);
        }
    }
}
