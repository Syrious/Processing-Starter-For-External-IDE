# Introduction

This module serves as a very simple starter with example for using an external IDE (IntelliJ IDEA in particular) with  
[Processing](https://processing.org/).

Its main goal is to avoid injecting an PApplet object via the constructor in each class you want to draw. Instead, this
project provides two approaches circumvent this problem:

1. By using the `ProcessingStarter` class which itself provides the PApplet object `pApplet` or short `p` which then can
   be directly accessed in your classes.
2. By extending your classes with `ProcessingWrapper`. There you can use almost every processing command you want

# Setup

1. Clone or download the project
2. Open the project in your IDE
3. Install the processing libs
    * [IntelliJ](https://linuxtut.com/en/49b803b3217e642cfbd1/)
    * [Eclipse](https://happycoding.io/tutorials/java/processing-in-java)
    * NetBeans: TBD

# Usage

* Create a class with a method you want to use for drawing
* Use Import or Wrapper
    * Import: Import `ProcessingStarter` in your class. I'd advise to use static import
      e.g. `import static main.java.ProcessingStarter.p;`
    * Wrapper: Extend your class with `ProcessingWrapper`
* Using `p.` (when using the import approach) you can call all the Processing methods or just call the method directly (
  when using wrapper approach)
    * E.g. `p.frameRate` resp. `framerate` will return the current frame rate.
* Start your project by running the main-Method in ProcessingStarter.java
* Also see the provides examples

# Disclaimer

I implemented and tested this code
with [Processing version 4.0 Beta 2](https://github.com/processing/processing4/releases/tag/processing-1277-4.0b2)
