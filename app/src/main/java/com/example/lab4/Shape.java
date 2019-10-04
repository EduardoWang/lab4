package com.example.lab4;

public abstract class Shape {
    private int x;
    private int y;

    private String color="$PUT_YOUR_CHOICE_OF_COLOR";


    public Shape() {
        x = 1;
        y = 1;
    }

    public Shape(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
