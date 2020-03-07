package tech.rapiddelivery.solid.liskov.square.correct;

public class Main {
    public static void main(String[] args) {
        final Shape[] shapes = {
                new Rectangle(5, 4),
                new Square(3)
        };

        for (Shape s : shapes) {
            System.out.print(s.area());
        }
    }
}
