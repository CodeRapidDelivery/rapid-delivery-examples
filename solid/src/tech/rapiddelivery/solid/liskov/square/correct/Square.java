package tech.rapiddelivery.solid.liskov.square.correct;

public class Square implements Shape {
    private double length;

    @Override
    public double area() {
        return Math.pow(length, 2);
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
