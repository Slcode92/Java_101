package com.suraj;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

	   //primitive Type

//	    byte x = 1;
//	    byte y = x;
//	    x =2;
//        System.out.println( y);

        //Reference Type
        Point point1 = new Point(1,1 );
        Point point2 = point1;             //Point 1 and 2 are referencing the same object
        point1.x=2;
        System.out.println( point2);


    }
}
