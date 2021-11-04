package Memento;

import Shapes.Shape;

import java.util.List;

public class Memento {
    List<Shape> shapes;
    int shapeSelected;

    public Memento(List<Shape> shapes, int shapeSelected) {
        this.shapes = shapes;
        this.shapeSelected = shapeSelected;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public int getShapeSelected() {
        return shapeSelected;
    }
}
