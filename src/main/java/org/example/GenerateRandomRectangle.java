package org.example;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomRectangle {
    public static Rectangle RandomRectangle(){
        return new Rectangle(ThreadLocalRandom.current().nextInt(10, 100 + 1), ThreadLocalRandom.current().nextInt(50, 100 + 1), ThreadLocalRandom.current().nextInt(10, 100 + 1), ThreadLocalRandom.current().nextInt(10, 100 + 1));
    }
}
