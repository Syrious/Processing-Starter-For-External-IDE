package main.java.de.project.edu;

import processing.core.PApplet;

public class Provider extends PApplet{
    public static PApplet pApplet;
    public static PApplet p;

    public static Main main;

    public Provider() {
        Provider.pApplet = this;
        Provider.p = Provider.pApplet;
    }

    public static void setMain(Main main) {
        Provider.main = main;
    }

    @Override
    public void settings() {
        main.settings();
    }

    @Override
    public void setup() {
        main.setup();
    }

    @Override
    public void draw() {
        main.draw();
    }
}
