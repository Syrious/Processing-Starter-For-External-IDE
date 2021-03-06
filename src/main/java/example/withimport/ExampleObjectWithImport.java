package main.java.example.withimport;

import main.java.ProcessingHelper.Time;
import main.java.interfaces.Drawable;

import java.util.Random;

import static main.java.ProcessingStarter.p;

/**
 * Example object which implements the {@link Drawable} interface
 */
public class ExampleObjectWithImport implements Drawable {

    private float x;
    private final float y;
    private final float extent;
    private final float speed;

    public ExampleObjectWithImport(float x, float y, float extent) {
        this.x = x;
        this.y = y;
        this.extent = extent;

        speed = 0.01f + new Random().nextFloat() * 100;
    }

    @Override
    public void draw() {
        x += speed * Time.deltaTime;

        p.noStroke();
        p.fill(15, 0, 200);
        p.circle(x, y, extent);
    }
}
