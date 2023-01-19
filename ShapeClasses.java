import java.lang.Math;

class Circle {
    private double radius;
    private final double pi = 3.141549265;

    public Circle(double radius) {
        this.radius = radius;
    }

    public int getArea() {
        return (int) Math.ceil(pi * radius * radius);
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return (int) Math.ceil(width * height);
    }
}

class Square {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public int getArea() {
        return (int) Math.ceil(width * width);
    }
}
