package Main;

import Canvas.Canvas;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File(args[0]);

        Canvas canvas = new Canvas();
        canvas.startDrawing(inputFile);
    }
}
