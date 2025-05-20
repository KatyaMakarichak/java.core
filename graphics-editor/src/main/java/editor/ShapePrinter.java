package editor;

public class ShapePrinter {
    public void printShape(Shape shape) {
        System.out.println("This is a " + shape.getName());
        shape.draw();
        System.out.println("---");
    }
}
