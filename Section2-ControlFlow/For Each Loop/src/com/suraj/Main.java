package com.suraj;

public class Main {

    public static void main(String[] args) {
	    String [] fruits = {"Apple","Mango","Orange"};

	    for(int i = 0; i<fruits.length;i++)
            System.out.println(fruits[i]);


	    //ForEach loop
	    for (String fruit: fruits)
            System.out.println(fruit);


    }
}