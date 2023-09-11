package org.example.entity;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private WaterRevolver waterRevolver;

    public Game() {
    }

    public Game(ArrayList<Player> players, WaterRevolver waterRevolver) {
        this.players = players;
        this.waterRevolver = waterRevolver;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public WaterRevolver getWaterRevolver() {
        return waterRevolver;
    }

    public void setWaterRevolver(WaterRevolver waterRevolver) {
        this.waterRevolver = waterRevolver;
    }

    public void fulfillGame(ArrayList<Player> oplayers, WaterRevolver owaterRevolver) {
        setPlayers(oplayers);
        setWaterRevolver(owaterRevolver);
    }

    public void round() {

        for (int i=0; i<players.size(); i++) {
            Player currentPlayer = players.get(i);
            boolean isPlayerWet = currentPlayer.shot(waterRevolver);
            waterRevolver.nextJet();

            if (isPlayerWet) {
                break;
            }
        }

    }
}
