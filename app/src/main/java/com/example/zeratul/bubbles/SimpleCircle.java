package com.example.zeratul.bubbles;

public class SimpleCircle {

    protected int x;
    protected int y;
    protected int radius;
    private int color;

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

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public SimpleCircle getCirclearea() {
        return new SimpleCircle(x, y, radius * 3);
    }
}
