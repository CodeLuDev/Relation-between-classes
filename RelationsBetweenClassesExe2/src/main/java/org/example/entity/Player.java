package org.example.entity;

public class Player {

    private String name;
    private int id;
    private boolean wet;

    public Player() {
    }

    public Player(int id, String name, boolean wet) {
        this.id = id;
        this.name = name;
        this.wet = wet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    public boolean shot(WaterRevolver revolver) {

        boolean hasShot = false;

        if (revolver.wet()) {
            hasShot = true;
            this.setWet(true);
            revolver.nextJet();
        }

        return hasShot;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + this.getName() + '\'' +
                " " + this.getId() +
                ", is wet?=" + this.isWet() +
                '}';
    }
}
