package tech.rapiddelivery.solid.liskov.square.violation;

// -ea you should run the program with
class Main {
    public static void main(String[] args) {
        final Rectangle[] rectangles = {
                new Rectangle(),
                new Square()
        };

        setArea(new Rectangle(), 5, 6);
        setArea(new Square(), 5, 6);
    }

    private static void setArea(Rectangle rectangle, double width, double height) {
        rectangle.setHeight(width);
        rectangle.setWidth(height);
        assert 1 == 2;
        assert  rectangle.area() == height * width;
    }
}

class Rectangle {
    double width;
    double height;

    public double area() {
        return width * height;
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

class Square extends Rectangle {

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(double height) {
        this.width = height;
        this.height = height;
    }
}
