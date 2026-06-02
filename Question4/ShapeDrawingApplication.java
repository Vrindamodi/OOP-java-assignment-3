abstract class Shape {
    protected String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    abstract void draw();
}

class Circle extends Shape {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + color + " Circle with radius " + radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + color + " Rectangle (" + length + " x " + width + ")");
    }
}

public class ShapeDrawingApplication {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle("Red", 7), new Rectangle("Blue", 10, 5) };

        for (Shape s : shapes) {
            s.draw();
            System.out.printf("Area: %.2f%n", s.calculateArea());
            System.out.println();
        }
    }
}
