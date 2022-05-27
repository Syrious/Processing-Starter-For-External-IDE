package main.java.de.project.edu;


import static main.java.de.project.edu.ProcessingStarter.p;

public class Ball {
    private float x;

    public void draw() {
        x += p.frameCount / p.frameRate;
        p.circle(x, 50f, 50f);
    }
}
