package com.taiye.ogunlade.dsa.adt;

import com.taiye.ogunlade.dsa.adt.interfaces.Circular;
import com.taiye.ogunlade.dsa.adt.interfaces.Measureable;

public class Circle implements Measureable, Circular {
    private double radius;

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
