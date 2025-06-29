package app.model;

public class Tree extends Plant {
    private int springMin = 10;
    private int springMax = 20;
    private int summerMin = 10;
    private int summerMax = 20;
    private int autumnMin = 0;
    private int autumnMax = 10;
    private int winterMin = 0;
    private int winterMax = 10;

    public Tree(double height, double heightMax) {
        super(height, heightMax);
    }

    public void spring() {
        growRandom(springMin, springMax);
    }

    public void summer() {
        growRandom(summerMin, summerMax);
    }

    public void autumn() {
        growRandom(autumnMin, autumnMax);
    }

    public void winter() {
        growRandom(winterMin, winterMax);
    }

    @Override
    public String toString() {
        if (getHeight() == getHeightMax()){
            return String.format("Дерево высотой %.2f см. Оно достигло максимальной высоты и больше не растёт", getHeight());
        }
        return String.format("Дерево высотой %.2f см", getHeight());
    }
}
