package main.java;

import processing.core.PApplet;

/**
 * Entry point for processing sketches. Provides a PApplet-object on which all processing
 * methods can be invoked.
 * <p>
 * Example:
 * <pre>
 *     ProcessingStarter.p.circle(10f, 10f, 25f); // Creates a circle at x=10, y=10 with an extent of 25 px
 * </pre>
 * <p>
 * Use On-Demand static imports to shorten the usage:
 * <pre>
 *     import static main.java.ProcessingStarter.p
 *     ...
 *     p.circle(10f, 10f, 25f);
 * </pre>
 */
public class ProcessingStarter extends PApplet {
    /**
     * Shorthand for {@link ProcessingStarter#pApplet}.
     */
    public static PApplet p;


    /**
     * The Processing object on which all processing calls are sent. Consider using the shorthand
     * {@link ProcessingStarter#p}.
     */
    public static PApplet pApplet;

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
        pApplet = p;
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
        ProcessingHelper.Time.calculateDelta();
        entry.draw();
    }
}