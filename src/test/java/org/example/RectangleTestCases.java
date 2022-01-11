package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.awt.*;

public class RectangleTestCases
{
    @Test
    public void case1_Intersection()
    {
        Rectangle r = new Rectangle(50, 50, 100, 100);
        Rectangle r1 = new Rectangle(75, 75, 200, 200);
        assertTrue(RectangleTest.isIntersection(r,r1));
        assertFalse(RectangleTest.isContainment(r,r1));
        assertFalse(RectangleTest.isAdjacent(r,r1));
    }
    @Test
    public void case2_Containment()
    {
        Rectangle r = new Rectangle(50, 50, 100, 100);
        Rectangle r1 = new Rectangle(75, 75, 50, 50);
        assertFalse(RectangleTest.isIntersection(r,r1));
        assertTrue(RectangleTest.isContainment(r,r1));
        assertFalse(RectangleTest.isAdjacent(r,r1));
    }
    @Test
    public void case3_Adjacency()
    {
        Rectangle r = new Rectangle(50, 50, 100, 100);
        Rectangle r1 = new Rectangle(150, 100, 75, 75);
        assertFalse(RectangleTest.isIntersection(r,r1));
        assertFalse(RectangleTest.isContainment(r,r1));
        assertTrue(RectangleTest.isAdjacent(r,r1));
    }
    @Test
    public void case4_Nothing()
    {
        Rectangle r = new Rectangle(50, 50, 100, 100);
        Rectangle r1 = new Rectangle(200, 200, 50, 50);
        assertFalse(RectangleTest.isIntersection(r,r1));
        assertFalse(RectangleTest.isContainment(r,r1));
        assertFalse(RectangleTest.isAdjacent(r,r1));
    }
    @Test
    public void case5_Adjacency_and_Containment()
    {
        /**
         * Given the prompt I understood that if a rectangle was contained within a rectangle it was adjacent
         */
        Rectangle r = new Rectangle(50, 50, 100, 100);
        Rectangle r1 = new Rectangle(100, 100, 50, 50);
        assertFalse(RectangleTest.isIntersection(r,r1));
        assertTrue(RectangleTest.isContainment(r,r1));
        assertFalse(RectangleTest.isAdjacent(r,r1));

        Rectangle r2 = new Rectangle(50, 50, 100, 100);
        Rectangle r3 = new Rectangle(50, 100, 50, 50);
        assertFalse(RectangleTest.isIntersection(r2,r3));
        assertTrue(RectangleTest.isContainment(r2,r3));
        assertFalse(RectangleTest.isAdjacent(r2,r3));


    }
}