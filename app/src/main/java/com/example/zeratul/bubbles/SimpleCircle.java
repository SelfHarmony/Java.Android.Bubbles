package com.example.zeratul.bubbles;

public class SimpleCircle {

    protected int x;
    protected int y;
    protected int radius;

    public SimpleCircle(int y, int x, int radius) {
        this.y = y;
        this.x = x;
        this.radius = radius;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getRadius() {
        return radius;
    }
}
