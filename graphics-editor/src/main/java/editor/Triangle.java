package editor;

public class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with base 3.0 and height 4.0");
    }
}
