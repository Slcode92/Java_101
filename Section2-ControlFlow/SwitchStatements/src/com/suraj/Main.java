package com.suraj;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	    int role = 1;

	    if(role == 1)
            System.out.println( "You're an admin");
        else if (role == 2)
            System.out.println("You're a moderator");
        else
            System.out.println("Your a guest");



        switch (role ){
            case 1:
                System.out.println("Your a admin");
                break;

            case 2:
                System.out.println("Your a moderator");
                break;

            default:
                System.out.println("Your a guest");


        }
    }
}
