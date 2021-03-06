package Shapes;

public abstract class Shape {
    DrawingStrategy drawingStrategy;

    String color;
    int x;
    int y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void color(String color) {
        this.color = color;
    }

    public void draw() {
        drawingStrategy.draw();
    }

    public void setDrawingStrategy(DrawingStrategy drawingStrategy) {
        this.drawingStrategy = drawingStrategy;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
