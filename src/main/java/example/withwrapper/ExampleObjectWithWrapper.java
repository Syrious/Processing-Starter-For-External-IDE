package main.java.example.withwrapper;

import main.java.ProcessingHelper.Time;
import main.java.ProcessingWrapper;
import main.java.interfaces.Drawable;

import java.util.Random;

/**
 * Example object using the wrapper approach. It also implements the {@link Drawable} interface
 */
public class ExampleObjectWithWrapper extends ProcessingWrapper implements Drawable {

    private float x;
    private final float y;
    private final float extent;
    private final float speed;

    public ExampleObjectWithWrapper(float x, float y, float extent) {
        this.x = x;
        this.y = y;
        this.extent = extent;

        speed = 0.01f + new Random().nextFloat() * 100;
    }

    @Override
    public void draw() {
        x -= speed * Time.deltaTime;

        noStroke();
        fill(200, 0, 15);
        circle(x, y, extent);
    }
}
