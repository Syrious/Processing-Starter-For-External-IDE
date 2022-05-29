package main.java;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.PMatrix;
import processing.core.PMatrix2D;
import processing.core.PMatrix3D;
import processing.core.PShape;
import processing.core.PStyle;
import processing.core.PSurface;
import processing.data.JSONArray;
import processing.data.JSONObject;
import processing.data.Table;
import processing.data.XML;
import processing.event.Event;
import processing.event.KeyEvent;
import processing.event.MouseEvent;
import processing.opengl.PGL;
import processing.opengl.PShader;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import static main.java.ProcessingStarter.p;
import static main.java.ProcessingStarter.pApplet;

@SuppressWarnings("unused")
public abstract class ProcessingWrapper {
    public static final String javaVersionName = PApplet.javaVersionName;
    public static final int javaPlatform = PApplet.javaPlatform;
    /**
     * @deprecated
     */
    @Deprecated
    public static final float javaVersion = PApplet.javaVersion;
    public static int platform = PApplet.platform;
    public static boolean useNativeSelect = PApplet.useNativeSelect;
    public PGraphics g = pApplet.g;
    public int displayWidth = pApplet.displayWidth;
    public int displayHeight = pApplet.displayHeight;
    public PGraphics recorder = pApplet.recorder;
    public String[] args = pApplet.args;
    public static final int DEFAULT_WIDTH = PApplet.DEFAULT_WIDTH;
    public static final int DEFAULT_HEIGHT = PApplet.DEFAULT_HEIGHT;
    public int[] pixels = pApplet.pixels;
    public int width = pApplet.width;
    public int height = pApplet.height;
    public int pixelWidth = pApplet.pixelWidth;
    public int pixelHeight = pApplet.pixelHeight;
    public int mouseX = pApplet.mouseX;
    public int mouseY = pApplet.mouseY;
    public int pmouseX = pApplet.pmouseX;
    public int pmouseY = pApplet.pmouseY;
    /**
     * @deprecated
     */
    @Deprecated
    public boolean firstMouse = pApplet.firstMouse;
    public int mouseButton = pApplet.mouseButton;
    public boolean mousePressed = pApplet.mousePressed;
    /**
     * @deprecated
     */
    @Deprecated
    public MouseEvent mouseEvent = pApplet.mouseEvent;
    public char key = pApplet.key;
    public int keyCode = pApplet.keyCode;
    public boolean keyPressed = pApplet.keyPressed;
    /**
     * @deprecated
     */
    @Deprecated
    public KeyEvent keyEvent = pApplet.keyEvent;
    public boolean focused = pApplet.focused;
    public float frameRate = pApplet.frameRate;
    public int frameCount = pApplet.frameCount;
    public volatile boolean finished = pApplet.finished;
    public static final String ARGS_EDITOR_LOCATION = PApplet.ARGS_EDITOR_LOCATION;
    public static final String ARGS_EXTERNAL = PApplet.ARGS_EXTERNAL;
    public static final String ARGS_LOCATION = PApplet.ARGS_LOCATION;
    public static final String ARGS_DISPLAY = PApplet.ARGS_DISPLAY;
    public static final String ARGS_DISABLE_AWT = PApplet.ARGS_DISABLE_AWT;
    public static final String ARGS_BGCOLOR = PApplet.ARGS_BGCOLOR;
    public static final String ARGS_FULL_SCREEN = PApplet.ARGS_FULL_SCREEN;
    public static final String ARGS_WINDOW_COLOR = PApplet.ARGS_WINDOW_COLOR;
    public static final String ARGS_PRESENT = PApplet.ARGS_PRESENT;
    public static final String ARGS_STOP_COLOR = PApplet.ARGS_STOP_COLOR;
    public static final String ARGS_HIDE_STOP = PApplet.ARGS_HIDE_STOP;
    public static final String ARGS_SKETCH_FOLDER = PApplet.ARGS_SKETCH_FOLDER;
    public static final String ARGS_DENSITY = PApplet.ARGS_DENSITY;
    public static final String EXTERNAL_STOP = PApplet.EXTERNAL_STOP;
    public static final String EXTERNAL_MOVE = PApplet.EXTERNAL_MOVE;
    public int pixelDensity = p.pixelDensity;

    public PSurface getSurface() {
        return pApplet.getSurface();
    }

    public int displayDensity() {
        return pApplet.displayDensity();
    }

    public int displayDensity(int display) {
        return pApplet.displayDensity(display);
    }

    public void pixelDensity(int density) {
        pApplet.pixelDensity(density);
    }

    public void setSize(int width, int height) {
        pApplet.setSize(width, height);
    }

    public void smooth() {
        pApplet.smooth();
    }

    public void smooth(int level) {
        pApplet.smooth(level);
    }

    public void noSmooth() {
        pApplet.noSmooth();
    }

    public PGraphics getGraphics() {
        return pApplet.getGraphics();
    }

    public void orientation(int which) {
        pApplet.orientation(which);
    }

    public void registerMethod(String methodName, Object target) {
        pApplet.registerMethod(methodName, target);
    }

    public void unregisterMethod(String name, Object target) {
        pApplet.unregisterMethod(name, target);
    }

    public void draw() {
        pApplet.draw();
    }

    public void fullScreen() {
        pApplet.fullScreen();
    }

    public void fullScreen(int display) {
        pApplet.fullScreen(display);
    }

    public void fullScreen(String renderer) {
        pApplet.fullScreen(renderer);
    }

    public void fullScreen(String renderer, int display) {
        pApplet.fullScreen(renderer, display);
    }

    public void size(int width, int height) {
        pApplet.size(width, height);
    }

    public void size(int width, int height, String renderer) {
        pApplet.size(width, height, renderer);
    }

    public void size(int width, int height, String renderer, String path) {
        pApplet.size(width, height, renderer, path);
    }

    public PGraphics createGraphics(int w, int h) {
        return pApplet.createGraphics(w, h);
    }

    public PGraphics createGraphics(int w, int h, String renderer) {
        return pApplet.createGraphics(w, h, renderer);
    }

    public PGraphics createGraphics(int w, int h, String renderer, String path) {
        return pApplet.createGraphics(w, h, renderer, path);
    }

    public PImage createImage(int w, int h, int format) {
        return pApplet.createImage(w, h, format);
    }

    public void handleDraw() {
        pApplet.handleDraw();
    }

    public synchronized void redraw() {
        pApplet.redraw();
    }

    public synchronized void loop() {
        pApplet.loop();
    }

    public synchronized void noLoop() {
        pApplet.noLoop();
    }

    public boolean isLooping() {
        return pApplet.isLooping();
    }

    public void postEvent(Event pe) {
        pApplet.postEvent(pe);
    }

    public void mousePressed() {
        pApplet.mousePressed();
    }

    public void mousePressed(MouseEvent event) {
        pApplet.mousePressed(event);
    }

    public void mouseReleased() {
        pApplet.mouseReleased();
    }

    public void mouseReleased(MouseEvent event) {
        pApplet.mouseReleased(event);
    }

    public void mouseClicked() {
        pApplet.mouseClicked();
    }

    public void mouseClicked(MouseEvent event) {
        pApplet.mouseClicked(event);
    }

    public void mouseDragged() {
        pApplet.mouseDragged();
    }

    public void mouseDragged(MouseEvent event) {
        pApplet.mouseDragged(event);
    }

    public void mouseMoved() {
        pApplet.mouseMoved();
    }

    public void mouseMoved(MouseEvent event) {
        pApplet.mouseMoved(event);
    }

    public void mouseEntered() {
        pApplet.mouseEntered();
    }

    public void mouseEntered(MouseEvent event) {
        pApplet.mouseEntered(event);
    }

    public void mouseExited() {
        pApplet.mouseExited();
    }

    public void mouseExited(MouseEvent event) {
        pApplet.mouseExited(event);
    }

    public void mouseWheel() {
        pApplet.mouseWheel();
    }

    public void mouseWheel(MouseEvent event) {
        pApplet.mouseWheel(event);
    }

    public void keyPressed() {
        pApplet.keyPressed();
    }

    public void keyPressed(KeyEvent event) {
        pApplet.keyPressed(event);
    }

    public void keyReleased() {
        pApplet.keyReleased();
    }

    public void keyReleased(KeyEvent event) {
        pApplet.keyReleased(event);
    }

    public void keyTyped() {
        pApplet.keyTyped();
    }

    public void keyTyped(KeyEvent event) {
        pApplet.keyTyped(event);
    }

    public void focusGained() {
        pApplet.focusGained();
    }

    public void focusLost() {
        pApplet.focusLost();
    }

    public int millis() {
        return pApplet.millis();
    }

    public void delay(int napTime) {
        pApplet.delay(napTime);
    }

    public void frameRate(float fps) {
        pApplet.frameRate(fps);
    }

    public void link(String url) {
        pApplet.link(url);
    }

    public void die(String what) {
        pApplet.die(what);
    }

    public void die(String what, Exception e) {
        pApplet.die(what, e);
    }

    public void exit() {
        pApplet.exit();
    }

    public boolean exitCalled() {
        return pApplet.exitCalled();
    }

    public void exitActual() {
        pApplet.exitActual();
    }

    public void dispose() {
        pApplet.dispose();
    }

    public void method(String name) {
        pApplet.method(name);
    }

    public void thread(String name) {
        pApplet.thread(name);
    }

    public void save(String filename) {
        pApplet.save(filename);
    }

    public void saveFrame() {
        pApplet.saveFrame();
    }

    public void saveFrame(String filename) {
        pApplet.saveFrame(filename);
    }

    public String insertFrame(String what) {
        return pApplet.insertFrame(what);
    }

    public void cursor(int kind) {
        pApplet.cursor(kind);
    }

    public void cursor(PImage img) {
        pApplet.cursor(img);
    }

    public void cursor(PImage img, int x, int y) {
        pApplet.cursor(img, x, y);
    }

    public void cursor() {
        pApplet.cursor();
    }

    public void noCursor() {
        pApplet.noCursor();
    }

    public float noise(float x) {
        return pApplet.noise(x);
    }

    public float noise(float x, float y) {
        return pApplet.noise(x, y);
    }

    public float noise(float x, float y, float z) {
        return pApplet.noise(x, y, z);
    }

    public void noiseDetail(int lod) {
        pApplet.noiseDetail(lod);
    }

    public void noiseDetail(int lod, float falloff) {
        pApplet.noiseDetail(lod, falloff);
    }

    public void noiseSeed(long seed) {
        pApplet.noiseSeed(seed);
    }

    public PImage loadImage(String filename) {
        return pApplet.loadImage(filename);
    }

    public PImage loadImage(String filename, String extension) {
        return pApplet.loadImage(filename, extension);
    }

    public PImage requestImage(String filename) {
        return pApplet.requestImage(filename);
    }

    public PImage requestImage(String filename, String extension) {
        return pApplet.requestImage(filename, extension);
    }

    public XML loadXML(String filename) {
        return pApplet.loadXML(filename);
    }

    public XML loadXML(String filename, String options) {
        return pApplet.loadXML(filename, options);
    }

    public XML parseXML(String xmlString) {
        return pApplet.parseXML(xmlString);
    }

    public XML parseXML(String xmlString, String options) {
        return pApplet.parseXML(xmlString, options);
    }

    public boolean saveXML(XML xml, String filename) {
        return pApplet.saveXML(xml, filename);
    }

    public boolean saveXML(XML xml, String filename, String options) {
        return pApplet.saveXML(xml, filename, options);
    }

    public JSONObject parseJSONObject(String input) {
        return pApplet.parseJSONObject(input);
    }

    public JSONObject loadJSONObject(String filename) {
        return pApplet.loadJSONObject(filename);
    }

    public boolean saveJSONObject(JSONObject json, String filename) {
        return pApplet.saveJSONObject(json, filename);
    }

    public boolean saveJSONObject(JSONObject json, String filename, String options) {
        return pApplet.saveJSONObject(json, filename, options);
    }

    public JSONArray parseJSONArray(String input) {
        return pApplet.parseJSONArray(input);
    }

    public JSONArray loadJSONArray(String filename) {
        return pApplet.loadJSONArray(filename);
    }

    public boolean saveJSONArray(JSONArray json, String filename) {
        return pApplet.saveJSONArray(json, filename);
    }

    public boolean saveJSONArray(JSONArray json, String filename, String options) {
        return pApplet.saveJSONArray(json, filename, options);
    }

    public Table loadTable(String filename) {
        return pApplet.loadTable(filename);
    }

    public Table loadTable(String filename, String options) {
        return pApplet.loadTable(filename, options);
    }

    public boolean saveTable(Table table, String filename) {
        return pApplet.saveTable(table, filename);
    }

    public boolean saveTable(Table table, String filename, String options) {
        return pApplet.saveTable(table, filename, options);
    }

    public PFont loadFont(String filename) {
        return pApplet.loadFont(filename);
    }

    public PFont createFont(String name, float size) {
        return pApplet.createFont(name, size);
    }

    public PFont createFont(String name, float size, boolean smooth) {
        return pApplet.createFont(name, size, smooth);
    }

    public PFont createFont(String name, float size, boolean smooth, char[] charset) {
        return pApplet.createFont(name, size, smooth, charset);
    }

    public void selectInput(String prompt, String callback) {
        pApplet.selectInput(prompt, callback);
    }

    public void selectInput(String prompt, String callback, File file) {
        pApplet.selectInput(prompt, callback, file);
    }

    public void selectInput(String prompt, String callback, File file, Object callbackObject) {
        pApplet.selectInput(prompt, callback, file, callbackObject);
    }

    public void selectOutput(String prompt, String callback) {
        pApplet.selectOutput(prompt, callback);
    }

    public void selectOutput(String prompt, String callback, File file) {
        pApplet.selectOutput(prompt, callback, file);
    }

    public void selectOutput(String prompt, String callback, File file, Object callbackObject) {
        pApplet.selectOutput(prompt, callback, file, callbackObject);
    }

    public void selectFolder(String prompt, String callback) {
        pApplet.selectFolder(prompt, callback);
    }

    public void selectFolder(String prompt, String callback, File file) {
        pApplet.selectFolder(prompt, callback, file);
    }

    public void selectFolder(String prompt, String callback, File file, Object callbackObject) {
        pApplet.selectFolder(prompt, callback, file, callbackObject);
    }

    public String[] listPaths(String path, String... options) {
        return pApplet.listPaths(path, options);
    }

    public File[] listFiles(String path, String... options) {
        return pApplet.listFiles(path, options);
    }

    public BufferedReader createReader(String filename) {
        return pApplet.createReader(filename);
    }

    public PrintWriter createWriter(String filename) {
        return pApplet.createWriter(filename);
    }

    public InputStream createInput(String filename) {
        return pApplet.createInput(filename);
    }

    public InputStream createInputRaw(String filename) {
        return pApplet.createInputRaw(filename);
    }

    public byte[] loadBytes(String filename) {
        return pApplet.loadBytes(filename);
    }

    public String[] loadStrings(String filename) {
        return pApplet.loadStrings(filename);
    }

    public OutputStream createOutput(String filename) {
        return pApplet.createOutput(filename);
    }

    public boolean saveStream(String target, String source) {
        return pApplet.saveStream(target, source);
    }

    public boolean saveStream(File target, String source) {
        return pApplet.saveStream(target, source);
    }

    public boolean saveStream(String target, InputStream source) {
        return pApplet.saveStream(target, source);
    }

    public void saveBytes(String filename, byte[] data) {
        pApplet.saveBytes(filename, data);
    }

    public void saveStrings(String filename, String[] data) {
        pApplet.saveStrings(filename, data);
    }

    public String sketchPath() {
        return pApplet.sketchPath();
    }

    public String sketchPath(String where) {
        return pApplet.sketchPath(where);
    }

    public File sketchFile(String where) {
        return pApplet.sketchFile(where);
    }

    public String savePath(String where) {
        return pApplet.savePath(where);
    }

    public File saveFile(String where) {
        return pApplet.saveFile(where);
    }

    public String dataPath(String where) {
        return pApplet.dataPath(where);
    }

    public File dataFile(String where) {
        return pApplet.dataFile(where);
    }

    public int lerpColor(int c1, int c2, float amt) {
        return pApplet.lerpColor(c1, c2, amt);
    }

    public void frameMoved(int x, int y) {
        pApplet.frameMoved(x, y);
    }

    public void frameResized(int w, int h) {
        pApplet.frameResized(w, h);
    }

    public PGraphics beginRecord(String renderer, String filename) {
        return pApplet.beginRecord(renderer, filename);
    }

    public void beginRecord(PGraphics recorder) {
        pApplet.beginRecord(recorder);
    }

    public void endRecord() {
        pApplet.endRecord();
    }

    public PGraphics beginRaw(String renderer, String filename) {
        return pApplet.beginRaw(renderer, filename);
    }

    public void beginRaw(PGraphics rawGraphics) {
        pApplet.beginRaw(rawGraphics);
    }

    public void endRaw() {
        pApplet.endRaw();
    }

    public void loadPixels() {
        pApplet.loadPixels();
    }

    public void updatePixels() {
        pApplet.updatePixels();
    }

    public void updatePixels(int x1, int y1, int x2, int y2) {
        pApplet.updatePixels(x1, y1, x2, y2);
    }

    public PGL beginPGL() {
        return pApplet.beginPGL();
    }

    public void endPGL() {
        pApplet.endPGL();
    }

    public void flush() {
        pApplet.flush();
    }

    public void hint(int which) {
        pApplet.hint(which);
    }

    public void beginShape() {
        pApplet.beginShape();
    }

    public void beginShape(int kind) {
        pApplet.beginShape(kind);
    }

    public void edge(boolean edge) {
        pApplet.edge(edge);
    }

    public void normal(float nx, float ny, float nz) {
        pApplet.normal(nx, ny, nz);
    }

    public void attribPosition(String name, float x, float y, float z) {
        pApplet.attribPosition(name, x, y, z);
    }

    public void attribNormal(String name, float nx, float ny, float nz) {
        pApplet.attribNormal(name, nx, ny, nz);
    }

    public void attribColor(String name, int color) {
        pApplet.attribColor(name, color);
    }

    public void attrib(String name, float... values) {
        pApplet.attrib(name, values);
    }

    public void attrib(String name, int... values) {
        pApplet.attrib(name, values);
    }

    public void attrib(String name, boolean... values) {
        pApplet.attrib(name, values);
    }

    public void textureMode(int mode) {
        pApplet.textureMode(mode);
    }

    public void textureWrap(int wrap) {
        pApplet.textureWrap(wrap);
    }

    public void texture(PImage image) {
        pApplet.texture(image);
    }

    public void noTexture() {
        pApplet.noTexture();
    }

    public void vertex(float x, float y) {
        pApplet.vertex(x, y);
    }

    public void vertex(float x, float y, float z) {
        pApplet.vertex(x, y, z);
    }

    public void vertex(float[] v) {
        pApplet.vertex(v);
    }

    public void vertex(float x, float y, float u, float v) {
        pApplet.vertex(x, y, u, v);
    }

    public void vertex(float x, float y, float z, float u, float v) {
        pApplet.vertex(x, y, z, u, v);
    }

    public void beginContour() {
        pApplet.beginContour();
    }

    public void endContour() {
        pApplet.endContour();
    }

    public void endShape() {
        pApplet.endShape();
    }

    public void endShape(int mode) {
        pApplet.endShape(mode);
    }

    public PShape loadShape(String filename) {
        return pApplet.loadShape(filename);
    }

    public PShape loadShape(String filename, String options) {
        return pApplet.loadShape(filename, options);
    }

    public PShape createShape() {
        return pApplet.createShape();
    }

    public PShape createShape(int type) {
        return pApplet.createShape(type);
    }

    public PShape createShape(int kind, float... p) {
        return pApplet.createShape(kind, p);
    }

    public PShader loadShader(String fragFilename) {
        return pApplet.loadShader(fragFilename);
    }

    public PShader loadShader(String fragFilename, String vertFilename) {
        return pApplet.loadShader(fragFilename, vertFilename);
    }

    public void shader(PShader shader) {
        pApplet.shader(shader);
    }

    public void shader(PShader shader, int kind) {
        pApplet.shader(shader, kind);
    }

    public void resetShader() {
        pApplet.resetShader();
    }

    public void resetShader(int kind) {
        pApplet.resetShader(kind);
    }

    public void filter(PShader shader) {
        pApplet.filter(shader);
    }

    public void clip(float a, float b, float c, float d) {
        pApplet.clip(a, b, c, d);
    }

    public void noClip() {
        pApplet.noClip();
    }

    public void blendMode(int mode) {
        pApplet.blendMode(mode);
    }

    public void bezierVertex(float x2, float y2, float x3, float y3, float x4, float y4) {
        pApplet.bezierVertex(x2, y2, x3, y3, x4, y4);
    }

    public void bezierVertex(float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
        pApplet.bezierVertex(x2, y2, z2, x3, y3, z3, x4, y4, z4);
    }

    public void quadraticVertex(float cx, float cy, float x3, float y3) {
        pApplet.quadraticVertex(cx, cy, x3, y3);
    }

    public void quadraticVertex(float cx, float cy, float cz, float x3, float y3, float z3) {
        pApplet.quadraticVertex(cx, cy, cz, x3, y3, z3);
    }

    public void curveVertex(float x, float y) {
        pApplet.curveVertex(x, y);
    }

    public void curveVertex(float x, float y, float z) {
        pApplet.curveVertex(x, y, z);
    }

    public void point(float x, float y) {
        pApplet.point(x, y);
    }

    public void point(float x, float y, float z) {
        pApplet.point(x, y, z);
    }

    public void line(float x1, float y1, float x2, float y2) {
        pApplet.line(x1, y1, x2, y2);
    }

    public void line(float x1, float y1, float z1, float x2, float y2, float z2) {
        pApplet.line(x1, y1, z1, x2, y2, z2);
    }

    public void triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        pApplet.triangle(x1, y1, x2, y2, x3, y3);
    }

    public void quad(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        pApplet.quad(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public void rectMode(int mode) {
        pApplet.rectMode(mode);
    }

    public void rect(float a, float b, float c, float d) {
        pApplet.rect(a, b, c, d);
    }

    public void rect(float a, float b, float c, float d, float r) {
        pApplet.rect(a, b, c, d, r);
    }

    public void rect(float a, float b, float c, float d, float tl, float tr, float br, float bl) {
        pApplet.rect(a, b, c, d, tl, tr, br, bl);
    }

    public void square(float x, float y, float extent) {
        pApplet.square(x, y, extent);
    }

    public void ellipseMode(int mode) {
        pApplet.ellipseMode(mode);
    }

    public void ellipse(float a, float b, float c, float d) {
        pApplet.ellipse(a, b, c, d);
    }

    public void arc(float a, float b, float c, float d, float start, float stop) {
        pApplet.arc(a, b, c, d, start, stop);
    }

    public void arc(float a, float b, float c, float d, float start, float stop, int mode) {
        pApplet.arc(a, b, c, d, start, stop, mode);
    }

    public void circle(float x, float y, float extent) {
        pApplet.circle(x, y, extent);
    }

    public void box(float size) {
        pApplet.box(size);
    }

    public void box(float w, float h, float d) {
        pApplet.box(w, h, d);
    }

    public void sphereDetail(int res) {
        pApplet.sphereDetail(res);
    }

    public void sphereDetail(int ures, int vres) {
        pApplet.sphereDetail(ures, vres);
    }

    public void sphere(float r) {
        pApplet.sphere(r);
    }

    public float bezierPoint(float a, float b, float c, float d, float t) {
        return pApplet.bezierPoint(a, b, c, d, t);
    }

    public float bezierTangent(float a, float b, float c, float d, float t) {
        return pApplet.bezierTangent(a, b, c, d, t);
    }

    public void bezierDetail(int detail) {
        pApplet.bezierDetail(detail);
    }

    public void bezier(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        pApplet.bezier(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public void bezier(float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3,
                       float x4, float y4, float z4) {
        pApplet.bezier(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
    }

    public float curvePoint(float a, float b, float c, float d, float t) {
        return pApplet.curvePoint(a, b, c, d, t);
    }

    public float curveTangent(float a, float b, float c, float d, float t) {
        return pApplet.curveTangent(a, b, c, d, t);
    }

    public void curveDetail(int detail) {
        pApplet.curveDetail(detail);
    }

    public void curveTightness(float tightness) {
        pApplet.curveTightness(tightness);
    }

    public void curve(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        pApplet.curve(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public void curve(float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3,
                      float x4, float y4, float z4) {
        pApplet.curve(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
    }

    public void imageMode(int mode) {
        pApplet.imageMode(mode);
    }

    public void image(PImage img, float a, float b) {
        pApplet.image(img, a, b);
    }

    public void image(PImage img, float a, float b, float c, float d) {
        pApplet.image(img, a, b, c, d);
    }

    public void image(PImage img, float a, float b, float c, float d, int u1, int v1, int u2, int v2) {
        pApplet.image(img, a, b, c, d, u1, v1, u2, v2);
    }

    public void shapeMode(int mode) {
        pApplet.shapeMode(mode);
    }

    public void shape(PShape shape) {
        pApplet.shape(shape);
    }

    public void shape(PShape shape, float x, float y) {
        pApplet.shape(shape, x, y);
    }

    public void shape(PShape shape, float a, float b, float c, float d) {
        pApplet.shape(shape, a, b, c, d);
    }

    public void textAlign(int alignX) {
        pApplet.textAlign(alignX);
    }

    public void textAlign(int alignX, int alignY) {
        pApplet.textAlign(alignX, alignY);
    }

    public float textAscent() {
        return pApplet.textAscent();
    }

    public float textDescent() {
        return pApplet.textDescent();
    }

    public void textFont(PFont which) {
        pApplet.textFont(which);
    }

    public void textFont(PFont which, float size) {
        pApplet.textFont(which, size);
    }

    public void textLeading(float leading) {
        pApplet.textLeading(leading);
    }

    public void textMode(int mode) {
        pApplet.textMode(mode);
    }

    public void textSize(float size) {
        pApplet.textSize(size);
    }

    public float textWidth(char c) {
        return pApplet.textWidth(c);
    }

    public float textWidth(String str) {
        return pApplet.textWidth(str);
    }

    public float textWidth(char[] chars, int start, int length) {
        return pApplet.textWidth(chars, start, length);
    }

    public void text(char c, float x, float y) {
        pApplet.text(c, x, y);
    }

    public void text(char c, float x, float y, float z) {
        pApplet.text(c, x, y, z);
    }

    public void text(String str, float x, float y) {
        pApplet.text(str, x, y);
    }

    public void text(char[] chars, int start, int stop, float x, float y) {
        pApplet.text(chars, start, stop, x, y);
    }

    public void text(String str, float x, float y, float z) {
        pApplet.text(str, x, y, z);
    }

    public void text(char[] chars, int start, int stop, float x, float y, float z) {
        pApplet.text(chars, start, stop, x, y, z);
    }

    public void text(String str, float x1, float y1, float x2, float y2) {
        pApplet.text(str, x1, y1, x2, y2);
    }

    public void text(int num, float x, float y) {
        pApplet.text(num, x, y);
    }

    public void text(int num, float x, float y, float z) {
        pApplet.text(num, x, y, z);
    }

    public void text(float num, float x, float y) {
        pApplet.text(num, x, y);
    }

    public void text(float num, float x, float y, float z) {
        pApplet.text(num, x, y, z);
    }

    public void push() {
        pApplet.push();
    }

    public void pop() {
        pApplet.pop();
    }

    public void pushMatrix() {
        pApplet.pushMatrix();
    }

    public void popMatrix() {
        pApplet.popMatrix();
    }

    public void translate(float x, float y) {
        pApplet.translate(x, y);
    }

    public void translate(float x, float y, float z) {
        pApplet.translate(x, y, z);
    }

    public void rotate(float angle) {
        pApplet.rotate(angle);
    }

    public void rotateX(float angle) {
        pApplet.rotateX(angle);
    }

    public void rotateY(float angle) {
        pApplet.rotateY(angle);
    }

    public void rotateZ(float angle) {
        pApplet.rotateZ(angle);
    }

    public void rotate(float angle, float x, float y, float z) {
        pApplet.rotate(angle, x, y, z);
    }

    public void scale(float s) {
        pApplet.scale(s);
    }

    public void scale(float x, float y) {
        pApplet.scale(x, y);
    }

    public void scale(float x, float y, float z) {
        pApplet.scale(x, y, z);
    }

    public void shearX(float angle) {
        pApplet.shearX(angle);
    }

    public void shearY(float angle) {
        pApplet.shearY(angle);
    }

    public void resetMatrix() {
        pApplet.resetMatrix();
    }

    public void applyMatrix(PMatrix source) {
        pApplet.applyMatrix(source);
    }

    public void applyMatrix(PMatrix2D source) {
        pApplet.applyMatrix(source);
    }

    public void applyMatrix(float n00, float n01, float n02, float n10, float n11, float n12) {
        pApplet.applyMatrix(n00, n01, n02, n10, n11, n12);
    }

    public void applyMatrix(PMatrix3D source) {
        pApplet.applyMatrix(source);
    }

    public void applyMatrix(float n00, float n01, float n02, float n03, float n10, float n11, float n12, float n13,
                            float n20, float n21, float n22, float n23, float n30, float n31, float n32, float n33) {
        pApplet.applyMatrix(n00, n01, n02, n03, n10, n11, n12, n13, n20, n21, n22, n23, n30, n31, n32, n33);
    }

    public PMatrix getMatrix() {
        return pApplet.getMatrix();
    }

    public PMatrix2D getMatrix(PMatrix2D target) {
        return pApplet.getMatrix(target);
    }

    public PMatrix3D getMatrix(PMatrix3D target) {
        return pApplet.getMatrix(target);
    }

    public void setMatrix(PMatrix source) {
        pApplet.setMatrix(source);
    }

    public void setMatrix(PMatrix2D source) {
        pApplet.setMatrix(source);
    }

    public void setMatrix(PMatrix3D source) {
        pApplet.setMatrix(source);
    }

    public void printMatrix() {
        pApplet.printMatrix();
    }

    public void beginCamera() {
        pApplet.beginCamera();
    }

    public void endCamera() {
        pApplet.endCamera();
    }

    public void camera() {
        pApplet.camera();
    }

    public void camera(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX,
                       float upY, float upZ) {
        pApplet.camera(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
    }

    public void printCamera() {
        pApplet.printCamera();
    }

    public void ortho() {
        pApplet.ortho();
    }

    public void ortho(float left, float right, float bottom, float top) {
        pApplet.ortho(left, right, bottom, top);
    }

    public void ortho(float left, float right, float bottom, float top, float near, float far) {
        pApplet.ortho(left, right, bottom, top, near, far);
    }

    public void perspective() {
        pApplet.perspective();
    }

    public void perspective(float fovy, float aspect, float zNear, float zFar) {
        pApplet.perspective(fovy, aspect, zNear, zFar);
    }

    public void frustum(float left, float right, float bottom, float top, float near, float far) {
        pApplet.frustum(left, right, bottom, top, near, far);
    }

    public void printProjection() {
        pApplet.printProjection();
    }

    public float screenX(float x, float y) {
        return pApplet.screenX(x, y);
    }

    public float screenY(float x, float y) {
        return pApplet.screenY(x, y);
    }

    public float screenX(float x, float y, float z) {
        return pApplet.screenX(x, y, z);
    }

    public float screenY(float x, float y, float z) {
        return pApplet.screenY(x, y, z);
    }

    public float screenZ(float x, float y, float z) {
        return pApplet.screenZ(x, y, z);
    }

    public float modelX(float x, float y, float z) {
        return pApplet.modelX(x, y, z);
    }

    public float modelY(float x, float y, float z) {
        return pApplet.modelY(x, y, z);
    }

    public float modelZ(float x, float y, float z) {
        return pApplet.modelZ(x, y, z);
    }

    public void pushStyle() {
        pApplet.pushStyle();
    }

    public void popStyle() {
        pApplet.popStyle();
    }

    public void style(PStyle s) {
        pApplet.style(s);
    }

    public void strokeWeight(float weight) {
        pApplet.strokeWeight(weight);
    }

    public void strokeJoin(int join) {
        pApplet.strokeJoin(join);
    }

    public void strokeCap(int cap) {
        pApplet.strokeCap(cap);
    }

    public void noStroke() {
        pApplet.noStroke();
    }

    public void stroke(int rgb) {
        pApplet.stroke(rgb);
    }

    public void stroke(int rgb, float alpha) {
        pApplet.stroke(rgb, alpha);
    }

    public void stroke(float gray) {
        pApplet.stroke(gray);
    }

    public void stroke(float gray, float alpha) {
        pApplet.stroke(gray, alpha);
    }

    public void stroke(float v1, float v2, float v3) {
        pApplet.stroke(v1, v2, v3);
    }

    public void stroke(float v1, float v2, float v3, float alpha) {
        pApplet.stroke(v1, v2, v3, alpha);
    }

    public void noTint() {
        pApplet.noTint();
    }

    public void tint(int rgb) {
        pApplet.tint(rgb);
    }

    public void tint(int rgb, float alpha) {
        pApplet.tint(rgb, alpha);
    }

    public void tint(float gray) {
        pApplet.tint(gray);
    }

    public void tint(float gray, float alpha) {
        pApplet.tint(gray, alpha);
    }

    public void tint(float v1, float v2, float v3) {
        pApplet.tint(v1, v2, v3);
    }

    public void tint(float v1, float v2, float v3, float alpha) {
        pApplet.tint(v1, v2, v3, alpha);
    }

    public void noFill() {
        pApplet.noFill();
    }

    public void fill(int rgb) {
        pApplet.fill(rgb);
    }

    public void fill(int rgb, float alpha) {
        pApplet.fill(rgb, alpha);
    }

    public void fill(float gray) {
        pApplet.fill(gray);
    }

    public void fill(float gray, float alpha) {
        pApplet.fill(gray, alpha);
    }

    public void fill(float v1, float v2, float v3) {
        pApplet.fill(v1, v2, v3);
    }

    public void fill(float v1, float v2, float v3, float alpha) {
        pApplet.fill(v1, v2, v3, alpha);
    }

    public void ambient(int rgb) {
        pApplet.ambient(rgb);
    }

    public void ambient(float gray) {
        pApplet.ambient(gray);
    }

    public void ambient(float v1, float v2, float v3) {
        pApplet.ambient(v1, v2, v3);
    }

    public void specular(int rgb) {
        pApplet.specular(rgb);
    }

    public void specular(float gray) {
        pApplet.specular(gray);
    }

    public void specular(float v1, float v2, float v3) {
        pApplet.specular(v1, v2, v3);
    }

    public void shininess(float shine) {
        pApplet.shininess(shine);
    }

    public void emissive(int rgb) {
        pApplet.emissive(rgb);
    }

    public void emissive(float gray) {
        pApplet.emissive(gray);
    }

    public void emissive(float v1, float v2, float v3) {
        pApplet.emissive(v1, v2, v3);
    }

    public void lights() {
        pApplet.lights();
    }

    public void noLights() {
        pApplet.noLights();
    }

    public void ambientLight(float v1, float v2, float v3) {
        pApplet.ambientLight(v1, v2, v3);
    }

    public void ambientLight(float v1, float v2, float v3, float x, float y, float z) {
        pApplet.ambientLight(v1, v2, v3, x, y, z);
    }

    public void directionalLight(float v1, float v2, float v3, float nx, float ny, float nz) {
        pApplet.directionalLight(v1, v2, v3, nx, ny, nz);
    }

    public void pointLight(float v1, float v2, float v3, float x, float y, float z) {
        pApplet.pointLight(v1, v2, v3, x, y, z);
    }

    public void spotLight(float v1, float v2, float v3, float x, float y, float z, float nx, float ny, float nz,
                          float angle, float concentration) {
        pApplet.spotLight(v1, v2, v3, x, y, z, nx, ny, nz, angle, concentration);
    }

    public void lightFalloff(float constant, float linear, float quadratic) {
        pApplet.lightFalloff(constant, linear, quadratic);
    }

    public void lightSpecular(float v1, float v2, float v3) {
        pApplet.lightSpecular(v1, v2, v3);
    }

    public void background(int rgb) {
        pApplet.background(rgb);
    }

    public void background(int rgb, float alpha) {
        pApplet.background(rgb, alpha);
    }

    public void background(float gray) {
        pApplet.background(gray);
    }

    public void background(float gray, float alpha) {
        pApplet.background(gray, alpha);
    }

    public void background(float v1, float v2, float v3) {
        pApplet.background(v1, v2, v3);
    }

    public void background(float v1, float v2, float v3, float alpha) {
        pApplet.background(v1, v2, v3, alpha);
    }

    public void clear() {
        pApplet.clear();
    }

    public void background(PImage image) {
        pApplet.background(image);
    }

    public void colorMode(int mode) {
        pApplet.colorMode(mode);
    }

    public void colorMode(int mode, float max) {
        pApplet.colorMode(mode, max);
    }

    public void colorMode(int mode, float max1, float max2, float max3) {
        pApplet.colorMode(mode, max1, max2, max3);
    }

    public void colorMode(int mode, float max1, float max2, float max3, float maxA) {
        pApplet.colorMode(mode, max1, max2, max3, maxA);
    }

    public void checkAlpha() {
        pApplet.checkAlpha();
    }

    public int get(int x, int y) {
        return pApplet.get(x, y);
    }

    public PImage get(int x, int y, int w, int h) {
        return pApplet.get(x, y, w, h);
    }

    public PImage get() {
        return pApplet.get();
    }

    public PImage copy() {
        return pApplet.copy();
    }

    public void set(int x, int y, int c) {
        pApplet.set(x, y, c);
    }

    public void set(int x, int y, PImage img) {
        pApplet.set(x, y, img);
    }

    public void mask(PImage img) {
        pApplet.mask(img);
    }

    public void filter(int kind) {
        pApplet.filter(kind);
    }

    public void filter(int kind, float param) {
        pApplet.filter(kind, param);
    }

    public void copy(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
        pApplet.copy(sx, sy, sw, sh, dx, dy, dw, dh);
    }

    public void copy(PImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
        pApplet.copy(src, sx, sy, sw, sh, dx, dy, dw, dh);
    }

    public void blend(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh, int mode) {
        pApplet.blend(sx, sy, sw, sh, dx, dy, dw, dh, mode);
    }

    public void blend(PImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh, int mode) {
        pApplet.blend(src, sx, sy, sw, sh, dx, dy, dw, dh, mode);
    }
}
