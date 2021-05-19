package com.fengfeng.basic.constractorparams;

import java.beans.ConstructorProperties;

public class Point {
    //    @ConstructorProperties({"x", "y"})
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private final int x, y;

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);

    }

}
