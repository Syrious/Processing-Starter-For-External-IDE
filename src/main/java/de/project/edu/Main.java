package main.java.de.project.edu;

import processing.core.PApplet;

public class Main extends PApplet {
    public static Main main;

    public static void main(String... args) {
        PApplet.main(Main.class);
    }


    public void settings() {
        size(640, 360);
    }

    public void setup() {
        background(255);
    }


    public void draw() {
        circle(5f, 5f, 10f);
    }
}
