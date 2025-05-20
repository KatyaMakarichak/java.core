package editor;

public class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width 4.0 and height 2.0");
    }
}
