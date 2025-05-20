package editor;

public class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius 5.0");
    }
}
