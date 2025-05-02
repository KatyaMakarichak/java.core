public class GraphicsEditor {
    // Абстрактний базовий клас
    public static abstract class Shape {
        protected String name;

        public Shape(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract void draw();
    }

    // Класи-нащадки
    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Circle with radius " + radius);
        }
    }

    public static class Rectangle extends Shape {
        private double width, height;

        public Rectangle(double width, double height) {
            super("Rectangle");
            this.width = width;
            this.height = height;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle of size " + width + "x" + height);
        }
    }

    public static class Triangle extends Shape {
        public Triangle() {
            super("Triangle");
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Triangle");
        }
    }

    public static class Ellipse extends Shape {
        public Ellipse() {
            super("Ellipse");
        }

        @Override
        public void draw() {
            System.out.println("Drawing an Ellipse");
        }
    }

    public static class Pentagon extends Shape {
        public Pentagon() {
            super("Pentagon");
        }

        @Override
        public void draw() {
            System.out.println("Drawing a Pentagon");
        }
    }

    // Клас, який приймає фігуру
    public static class ShapePrinter {
        public void printShapeName(Shape shape) {
            System.out.println("This is a " + shape.getName());
        }

        public void renderShape(Shape shape) {
            shape.draw();
        }
    }

    // Точка входу
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(),
            new Ellipse(),
            new Pentagon()
        };

        for (Shape shape : shapes) {
            printer.printShapeName(shape);
            printer.renderShape(shape);
            System.out.println("---");
        }
    }
}

