package Oops;

// Abstract class — cannot be created directly
abstract class Shape {
    abstract double area(); // no body — child MUST implement
}

// Child 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Child 2
class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// Main
public class Abstraction2 {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Circle area    : " + s1.area()); // 78.53
        System.out.println("Rectangle area : " + s2.area()); // 24.0
    }
}