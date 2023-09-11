package org.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    List<Card> deck;
    List<Card> cardsPlayed;
    List<Card> cardsOnTheTable;

    public Deck() {
        deck = new ArrayList<>();
        cardsPlayed = new ArrayList<>();
        cardsOnTheTable = new ArrayList<>();
    }

    public List<Card> getCardsPlayed() {
        return cardsPlayed;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public List<Card> getCardsOnTheTable() {
        return cardsOnTheTable;
    }

    public void shuffle() {
        deck.sort((o1, o2) -> {
            Random random = new Random();
            return random.nextInt(3) - 1;
        });
    }

    public List<Card> giveCards(int numCards) {
        for (int i=0; i<numCards; i++) {
            cardsOnTheTable.add(getDeck().get(i));
            cardsPlayed.add(getDeck().get(i));
        }
        getDeck().removeAll(cardsOnTheTable);
        return cardsOnTheTable;
    }

    public int cardsAvailable() {
        return getDeck().size();
    }

    public Card nextCard() {
        return getDeck().get(0);
    }

    public List<Card> cardsPlayedUntilNow() {

        for (int i=0; i<getCardsPlayed().size(); i++) {
            getCardsPlayed().get(i);
        }

        return cardsPlayed;
    }

}
