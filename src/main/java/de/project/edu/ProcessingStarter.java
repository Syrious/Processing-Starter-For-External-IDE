package main.java.de.project.edu;

import processing.core.PApplet;


public class ProcessingStarter extends PApplet {
    public static PApplet p;
    private static Main entry;

    public static void main(String... args) {
        entry = new Main();
        PApplet.main(ProcessingStarter.class);
    }

    public ProcessingStarter() {
        if (p != null) {
            throw new RuntimeException("Constructor has already been called. Only one call is allowed!");
        }
        p = this;
    }

    @Override
    public void settings() {
        entry.settings();
    }

    @Override
    public void setup() {
        entry.setup();
    }

    @Override
    public void draw() {
        entry.draw();
    }
}
