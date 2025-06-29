package app.model;

import java.util.Random;

public abstract class Plant {
    private double height;
    private double heightMax;



    private Random random = new Random();

    public Plant(double height, double heightMax) {
        this.height = height;
        this.heightMax = heightMax;
    }

    public double getHeight() {
        return height;
    }

    public double getHeightMax() {
        return heightMax;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract void spring();
    public abstract void summer();
    public abstract void autumn();
    public abstract void winter();
    public void year(){
        spring();
        summer();
        autumn();
        winter();
    }
    public void grow(double cm) {
        if (getHeight() >= getHeightMax()) return;
        height += cm;
        if (height > heightMax) {
            height = heightMax;
        }
    }
    public void growRandom(int min, int max) {
        int cm = random.nextInt(max - min + 1) + min;
        grow(cm);
    }

    public abstract String toString();
}
