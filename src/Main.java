import Canvas.Canvas;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("InputSet1.txt");

        Canvas canvas = new Canvas();
        canvas.startDrawing(inputFile);
    }
}
