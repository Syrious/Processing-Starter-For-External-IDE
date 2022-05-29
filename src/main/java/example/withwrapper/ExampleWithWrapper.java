package main.java.example.withwrapper;

import main.java.ProcessingWrapper;
import main.java.interfaces.Drawable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Example code. Creates multiple objects which implements {@link Drawable} which then
 * get drawn inside {@link #drawSomething()}
 */
public class ExampleWithWrapper extends ProcessingWrapper {
    private final List<Drawable> drawables;

    public ExampleWithWrapper() {
        drawables = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            float x = random.nextInt(width);
            float y = random.nextInt(height);
            float extent = random.nextInt(100);

            drawables.add(new ExampleObjectWithWrapper(x, y, extent));
        }

    }

    public void drawSomething() {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
