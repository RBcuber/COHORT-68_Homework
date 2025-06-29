package app.model;

public class Square extends Figure{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calcArea(){
        return side*side;
     }


    @Override
    public String toString() {
        return String.format("Квадрат со стороной %.2f и площадью %.2f", side, calcArea());
    }
}
