package Canvas;

import Commands.Command;
import Commands.CreateCircleCommand;
import Commands.CreateRectangleCommand;
import Handlers.*;
import Memento.CareTaker;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Canvas {
    Handler firstHandler;
    CareTaker careTaker;

    List<Shape> shapes;
    int shapeSelected;

    public Canvas() {
        this.firstHandler = setUpHandlers();
        this.shapes = new ArrayList<>();
        this.shapeSelected = -1;
        this.careTaker = new CareTaker(this);
        createMemento();
    }

    public void startDrawing(File inputFile) {
        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                handleCommand(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void handleCommand(String line) {
        String[] command = line.toUpperCase().split(" ");
        firstHandler.handleRequest(command);
    }

    public void createMemento() {
        // TODO: create a new memento and use careTaker to save it to list of mementos
    }

    public void restoreMemento() {
        // TODO: use caretaker to load memento and restore shapes and selected to match the memento
    }

    private Handler setUpHandlers() {
        FinalHandler finalHandler = new FinalHandler(this);
        UndoHandler undoHandler = new UndoHandler(finalHandler, this);
        DrawsceneHandler drawsceneHandler = new DrawsceneHandler(undoHandler, this);
        DeleteHandler deleteHandler = new DeleteHandler(drawsceneHandler, this);
        ColorHandler colorHandler = new ColorHandler(deleteHandler, this);
        DrawHandler drawHandler = new DrawHandler(colorHandler, this);
        MoveHandler moveHandler = new MoveHandler(drawHandler, this);
        SelectHandler selectHandler = new SelectHandler(moveHandler, this);
        CreateCircleHandler createCircleHandler = new CreateCircleHandler(
            selectHandler, this);
        firstHandler = new CreateRectangleHandler(createCircleHandler, this);
        return firstHandler;
    }

    public void addShapeToCanvas(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapeSelected(int shapeSelected) {
        this.shapeSelected = shapeSelected;
    }

    public int getShapeSelected() {
        return shapeSelected;
    }
}
