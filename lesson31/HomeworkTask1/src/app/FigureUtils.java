package app;

import java.util.ArrayList;
import java.util.List;

public class FigureUtils {
    public static double getTotalArea(List<Figure> list) {
        double result = 0;
        for (Figure figure: list){
            result += figure.calcArea();
        }
        return result;
    }
    public static Figure getMaxAreaFigure(List<Figure> list) {
        double areaMax = list.get(0).calcArea();
        Figure figureMax = list.get(0);
        for (Figure figure: list){
           if (figure.calcArea() > areaMax){
               areaMax = figure.calcArea();
               figureMax = figure;
           }
        }
        return figureMax;
    }
    public static List<Figure> getFiguresLargerThan(List<Figure> list, double value) {
        List<Figure> filteredFigures = new ArrayList<>();
        for (Figure figure: list){
            if (figure.calcArea() > value){
                filteredFigures.add(figure);
            }
        }
        return filteredFigures;
    }
    public static void printFigures(List<Figure> list){
        for (Figure figure: list){
            System.out.println(figure);
        }
    }
}
