package app;

public class Bush extends Plant {
    private int springMin = 5;
    private int springMax = 15;
    private int summerMin = 5;
    private int summerMax = 15;
    private int autumnMin = 0;
    private int autumnMax = 6;

    public Bush(double height, double heightMax) {
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
        grow(0);
    }

    @Override
    public String toString() {
        if (getHeight() == getHeightMax()){
            return String.format("Куст высотой %.2f см. Он достиг максимальной высоты и больше не растёт", getHeight());
        }
        return String.format("Куст высотой %.2f см", getHeight());
    }
}
