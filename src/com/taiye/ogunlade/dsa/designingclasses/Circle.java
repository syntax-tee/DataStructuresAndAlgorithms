package com.taiye.ogunlade.dsa.designingclasses;

import com.taiye.ogunlade.dsa.designingclasses.interfaces.Circular;
import com.taiye.ogunlade.dsa.designingclasses.interfaces.Measureable;

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
