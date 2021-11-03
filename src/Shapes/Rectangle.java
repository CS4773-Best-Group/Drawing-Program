package Shapes;

public class Rectangle extends Shape {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
        this.color = "Red";

        drawingStrategy = new DrawRectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
