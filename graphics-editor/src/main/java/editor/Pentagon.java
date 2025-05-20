package editor;

public class Pentagon extends Shape {
    @Override
    public String getName() {
        return "Pentagon";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Pentagon with side length 2.0");
    }
}
