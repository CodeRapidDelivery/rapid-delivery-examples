package tech.rapiddelivery.solid.liskov.square.correct;

public class Rectangle implements Shape {
    double width;
    double height;

    @Override
    public double area() {
        return width * height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
