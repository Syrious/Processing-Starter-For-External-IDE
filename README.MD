# Introduction

This module serves as a very simple starter with example for using an external IDE (IntelliJ IDEA in particular) with  
[Processing](https://processing.org/).

Its main goal is to avoid injecting an PApplet object via the constructor in each class you want to draw. Instead, this
project provides a static class which itself provides the PApplet object `pApplet` or short `p` which then can be
directly accessed in your classes.

# Setup

1. Clone or download the project
2. Open the project in your IDE
3. Install the processing libs
   * [IntelliJ](https://linuxtut.com/en/49b803b3217e642cfbd1/)
   * [Eclipse](https://happycoding.io/tutorials/java/processing-in-java)
   * NetBeans: TBD

# Usage

* Create a class with a method you want to use for drawing
* Import ProcessingStarter. I'd advise to use static import e.g. `import static main.java.ProcessingStarter.p;`
* Using `p.` you can call all the Processing methods e.g. `p.frameRate` which returns the current frame rate.