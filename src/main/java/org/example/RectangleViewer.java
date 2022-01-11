package org.example;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;

public class RectangleViewer extends JFrame {
    static Rectangle r = GenerateRandomRectangle.RandomRectangle();
    static Rectangle r1 = GenerateRandomRectangle.RandomRectangle();

    RectangleViewer() {
        super("RectangleViewer");
        setSize(250, 250);
    }

    public void paint(Graphics g) {
        g.drawRect(r.x, r.y, r.width, r.height);
        g.drawRect(r1.x, r1.y, r1.width, r1.height);
    }

    public static void main(String[] args) {

        JFrame f = new RectangleViewer();
        System.out.println(RectangleTest.isIntersection(r,r1));
        System.out.println(RectangleTest.isContainment(r,r1));
        System.out.println(RectangleTest.isAdjacent(r,r1));
        f.setVisible(true);
    }
}