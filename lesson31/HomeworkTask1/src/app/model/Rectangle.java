package app.model;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    public double calcArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник %.2f x %.2f, площадь: %.2f", width, height, calcArea());
    }
}
