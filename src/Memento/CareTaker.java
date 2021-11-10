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
        if (memento != null) {
            mementoList.add(memento);
        }
    }

    public static Memento loadMemento() {
        int index = mementoList.size() - 1;
        Memento memento = mementoList.get(index);
        mementoList.remove(index);
        return memento;
    }
}
