package main.java;

import static main.java.ProcessingStarter.p;

public class ProcessingHelper {
    public static class Time {
        /**
         * The interval in seconds from the last frame to the current one.
         */
        public static float deltaTime;

        private static float previousMilli;

        protected static void calculateDelta() {
            deltaTime = (p.millis() - previousMilli) / 1000;
            previousMilli = p.millis();
        }
    }
}
