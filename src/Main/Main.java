package Main;

import Canvas.Canvas;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // TODO: take input file from command line (use args[0] instead of hardcoded string)
        File inputFile = new File(args[0]);

        Canvas canvas = new Canvas();
        canvas.startDrawing(inputFile);
    }
}
