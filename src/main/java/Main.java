package main.java;

import main.java.example.withimport.ExampleWithImport;
import main.java.example.withwrapper.ExampleWithWrapper;

import static main.java.ProcessingStarter.p;

/**
 * This is the main class of your sketch. Used to set up and draw your scetch.
 */
public class Main {
    // *** Example-Code ***
    private ExampleWithImport exampleWithImport;
    private ExampleWithWrapper exampleWithWrapper;
    // ********************

    public void settings() {
        p.size(1024, 768);
    }

    public void setup() {
        p.background(255);
        p.frameRate(60);

        // *** Example-Code ***
        exampleWithImport = new ExampleWithImport();
        exampleWithWrapper = new ExampleWithWrapper();
        // ********************
    }

    public void draw() {
        p.background(255);

        // *** Example-Code ***
        exampleWithImport.drawSomething();
        exampleWithWrapper.drawSomething();
        // ********************
    }
}
