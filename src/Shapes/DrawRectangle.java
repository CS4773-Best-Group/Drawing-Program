package Shapes;

public class DrawRectangle implements DrawingStrategy {
    Rectangle rectangle;

    public DrawRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle, " +
            "Color: %sOrigin: (%d,%d), Width: %d, Height :%d%n",
            rectangle.getColor(), rectangle.getX(), rectangle.getY(),
            rectangle.getWidth(), rectangle.getHeight());
    }
}
