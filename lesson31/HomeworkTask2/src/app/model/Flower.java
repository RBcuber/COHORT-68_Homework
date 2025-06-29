package app.model;

public class Flower extends Plant {
    private int springMin = 4;
    private int springMax = 11;
    private int summerMin = 10;
    private int summerMax = 20;


    private double maxObservedHeight = 0;

    public double getMaxObservedHeight() {
        return maxObservedHeight;
    }

    public Flower(double height, double heightMax) {
        super(height, heightMax);

    }

    public void spring() {
        growRandom(springMin, springMax);

    }

    public void summer() {
        growRandom(summerMin, summerMax);

    }

    public void autumn() {
        grow(0);
    }

    public void winter() {
        setHeight(0);
    }

    @Override
    public void grow(double cm) {
        super.grow(cm); // вызывает обычный рост
        if (getHeight() > maxObservedHeight) {
            maxObservedHeight = getHeight();
        }
    }

    @Override
    public String toString() {
        if (getHeight() == getHeightMax()){
            return String.format("Цветок высотой %.2f см. Он достиг максимальной высоты и больше не растёт", getHeight());

        }
        return String.format("Цветок высотой %.2f см (максимальная высота за цветение: %.2f)", getHeight(), getMaxObservedHeight());
    }
}
