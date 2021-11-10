package Memento;

import Canvas.Canvas;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    static List<Memento> mementoList;
    Canvas canvas;

    public CareTaker(Canvas canvas) {
        this.canvas = canvas;
        mementoList = new ArrayList<Memento>();
    }

    public static void saveMemento(Memento memento) {
        // TODO: add the newly created memento to the mementoList
        if (memento != null) {
            mementoList.add(memento);
        }
    }

    public static Memento loadMemento() {
        // TODO: remove and return the most previous memento from the list
        // remove 0 element
        int index = mementoList.size() - 1;
        Memento memento = mementoList.get(index);
        mementoList.remove(index);
        //System.out.println(memento.toString());
        return memento;
    }
}
