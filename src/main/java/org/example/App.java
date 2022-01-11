package org.example;
import java.awt.*;
public class App 
{

    public static void main( String[] args )
    {
        Rectangle r = new Rectangle(50, 50, 100, 100);
        Rectangle r1 = new Rectangle(200, 200, 50, 50);
        System.out.println(RectangleTest.isIntersection(r,r1));
        System.out.println(RectangleTest.isContainment(r,r1));
        System.out.println(RectangleTest.isAdjacent(r,r1));
    }
}
