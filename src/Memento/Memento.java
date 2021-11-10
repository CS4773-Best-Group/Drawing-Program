package Memento;

import Commands.Command;
import Shapes.Shape;

import java.util.List;

public class Memento {
    Command command;
    List<Shape> shapes;
    int shapeSelected;

    public Memento(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    //    public List<Shape> getShapes() {
//        return shapes;
//    }

//    public int getShapeSelected() {
//        return shapeSelected;
//    }
}
