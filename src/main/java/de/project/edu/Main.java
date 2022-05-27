package main.java.de.project.edu;

import processing.core.PApplet;

import static main.java.de.project.edu.Provider.pApplet;

public class Main {
    private Ball ball;
    public static void main(String... args) {
        new Main();
        PApplet.main(Provider.class);
    }

    public Main() {
        Provider.setMain(this);
    }

    public void settings() {
        pApplet.size(640, 360);
    }

    public void setup() {
        pApplet.background(255);
        ball = new Ball();
    }

    public void draw() {
        pApplet.circle(5f,5f,20f);

        ball.draw();
    }
}
