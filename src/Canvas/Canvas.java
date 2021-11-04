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
    int shapeSelected;

    public void startDrawing(File inputFile) {
        shapes = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                handleCommand(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private void handleCommand(String line) {
        String[] command = line.toUpperCase().split(" ");

        // TODO: CREATE HANDLERS AND PASS COMMAND ARRAY INTO THE FIRST HANDLER


    }

    public void addShapeToCanvas(Shape shape) {
        shapes.add(shape);
    }

}
