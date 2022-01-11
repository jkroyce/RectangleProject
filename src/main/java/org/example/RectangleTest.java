package org.example;

import java.awt.*;

public class RectangleTest {
    public static Boolean isIntersection(Rectangle x, Rectangle y){
        Rectangle c = x.intersection(y);
        if(c.equals(y)){
            return false;
        }
        return x.intersects(y);
    }
    public static  Boolean isContainment(Rectangle x, Rectangle y){
        return x.contains(y);
    }
    public static Boolean isAdjacent(Rectangle rect1,Rectangle rect2) {
        final double x0 = rect1.getX();
        final double y0 = rect1.getY();
        final double w0 = rect1.getWidth();
        final double h0 = rect1.getHeight();
        final double x = rect2.getX();
        final double y = rect2.getY();
        final double w = rect2.getWidth();
        final double h = rect2.getHeight();

        return (x0 + w0 == x) || (y0 + h0 == y) || (y + h == y0) || (x + w == x0);
    }
}
