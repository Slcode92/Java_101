package com.suraj;

public class Dragger {
    public void drag(UIWidget draggable){ //dragger class is dependant on UIWidget interface
        draggable.drag();
        System.out.println("Dragging done!");


    }
}
