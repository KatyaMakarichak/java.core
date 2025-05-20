package editor;

public class Ellipse extends Shape {
    @Override
    public String getName() {
        return "Ellipse";
    }

    @Override
    public void draw() {
        System.out.println("Drawing an Ellipse with radii 3.0 and 1.5");
    }
}
