package main.java;

import main.java.example.Example;

import static main.java.ProcessingStarter.p;

/**
 * This is the main class of your sketch. Used to set up and draw your scetch.
 */
public class Main {
    // *** Example-Code ***
    private Example example;
    // ********************

    public void settings() {
        p.size(1024, 768);
    }

    public void setup() {
        p.background(255);
        p.frameRate(60);

        // *** Example-Code ***
        example = new Example();
        // ********************
    }

    public void draw() {
        p.background(255);

        // *** Example-Code ***
        example.drawSomething();
        // ********************
    }
}
