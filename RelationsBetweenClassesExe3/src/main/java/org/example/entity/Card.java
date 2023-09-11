package org.example.entity;

public class Card {

    private int number;
    private String symbol;

    public Card() {
    }

    public Card(int number, String symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
