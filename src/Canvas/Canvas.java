package Canvas;

import Commands.Command;
import Commands.CreateCircleCommand;
import Commands.CreateRectangleCommand;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Canvas {
    List<Shape> shapes;

    public void startDrawing(File inputFile) {
        shapes = new ArrayList<Shape>();
        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                processCommand(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private void processCommand(String line) {
        String[] args = line.toUpperCase().split(" ");

        String command = args[0];
        switch (command) {
            case "CREATE":
                Shape newShape;
                if (args[1].equals("RECTANGLE")) {
                    Command createRectangleCommand = new CreateRectangleCommand(
                        this, Integer.parseInt(args[2]), Integer.parseInt(args[3]));
                    createRectangleCommand.execute();
                }
                else { // create circle
                    Command createCircleCommand = new CreateCircleCommand(
                        this, Integer.parseInt(args[2]));
                    createCircleCommand.execute();
                }
            case "SELECT":
                break;
            case "MOVE":
                break;
            case "DRAW":
                break;
            case "COLOR":
                break;
            case "DELETE":
                break;
            case "DRAWSCENE":
                break;
            case "UNDO":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }

    public void addShapeToCanvas(Shape shape) {
        shapes.add(shape);
    }

}
