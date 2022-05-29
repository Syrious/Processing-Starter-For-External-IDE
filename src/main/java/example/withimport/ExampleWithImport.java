package main.java.example.withimport;

import main.java.interfaces.Drawable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static main.java.ProcessingStarter.p;

/**
 * Example code. Creates multiple objects which implements {@link Drawable} which then
 * get drawn inside {@link #drawSomething()}
 */
public class ExampleWithImport {
    private final List<Drawable> drawables;

    public ExampleWithImport() {
        drawables = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            float x = random.nextInt(p.width);
            float y = random.nextInt(p.height);
            float extent = random.nextInt(100);

            drawables.add(new ExampleObjectWithImport(x, y, extent));
        }

    }

    public void drawSomething() {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
