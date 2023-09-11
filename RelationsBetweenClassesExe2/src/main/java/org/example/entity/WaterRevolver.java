package org.example.entity;

public class WaterRevolver {

    private int actualPosition;
    private int waterPosition;

    public WaterRevolver() {
    }

    public WaterRevolver(int actualPosition, int waterPosition) {
        this.actualPosition = actualPosition;
        this.waterPosition = waterPosition;
    }

    public int getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int actualPosition) {
        this.actualPosition = actualPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(int waterPosition) {
        this.waterPosition = waterPosition;
    }

    public void fillRevolver() {
        this.setActualPosition((int) (Math.random() * 6) +1);
        this.setWaterPosition((int) (Math.random() * 6) +1);
    }

    public boolean wet() {
        boolean areTheSame = false;

        if (this.getActualPosition() == this.getWaterPosition()) {
            areTheSame = true;
        }

        return areTheSame;
    }

    public void nextJet() {
        this.setActualPosition((int) (Math.random() * 6) +1);
    }

    @Override
    public String toString() {
        return "WaterRevolver{" +
                "actualPosition=" + actualPosition +
                ", waterPosition=" + waterPosition +
                '}';
    }
}
