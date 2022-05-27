package main.java.de.project.edu;

import static main.java.de.project.edu.ProcessingStarter.p;

public class Main {
    private Ball ball;

    public void settings() {
        p.size(640, 360);
    }

    public void setup() {
        p.background(255);
        ball = new Ball();
    }

    public void draw() {
        p.circle(5f, 5f, 20f);
        ball.draw();
    }
}
