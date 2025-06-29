package app;

import app.model.Figure;
import app.model.Circle;
import app.model.Rectangle;
import app.model.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        figures.add(new Circle(2));
        figures.add(new Circle(3));

        figures.add(new Square(1));
        figures.add(new Square(2));

        figures.add(new Rectangle(2, 4));
        figures.add(new Rectangle(3, 5));

        System.out.println("Все фигуры:");
        FigureUtils.printFigures(figures);
        System.out.println("===============================");


        double totalArea = FigureUtils.getTotalArea(figures);
        Figure biggest = FigureUtils.getMaxAreaFigure(figures);
        int areaLimit = 10;
        List<Figure> largeFigures = FigureUtils.getFiguresLargerThan(figures, areaLimit);

        System.out.printf("Суммарная площадь всех фигур: %.2f\n", totalArea);
        System.out.println("Фигура с самой большой площадью: " + biggest);
        System.out.println("Фигуры, с площадью больше, чем: "+ areaLimit);
        FigureUtils.printFigures(largeFigures);

    }



}
