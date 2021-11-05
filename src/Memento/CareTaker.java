package Memento;

import Canvas.Canvas;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementoList;
    Canvas canvas;

    public CareTaker(Canvas canvas) {
        this.canvas = canvas;
        mementoList = new ArrayList<Memento>();
    }

    public void saveMemento(Memento memento) {
        // TODO: add the newly created memento to the mementoList
        if (memento != null) {
            memento.getShapeSelected();
        }
    }

    public Memento loadMemento() {
        // TODO: remove and return the most previous memento from the list
        return null;
    }
}
