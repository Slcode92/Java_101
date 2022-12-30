package com.suraj;

public class Main {

    public static void main(String[] args) {
        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        TextBox textBox2 = new TextBox(); //STORED ON HEAP
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toLowerCase());


        TextBox textBox3 = textBox1;




    }
}
