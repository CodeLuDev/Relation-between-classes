package service;

import org.example.entity.Card;
import org.example.entity.Deck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestingGame {

    @Test
    public void verifyAddingCardInDesk() {

        Deck deck = new Deck();

        Card card1 = new Card(1,"Oro");
        Card card2 = new Card(2,"Oro");

        deck.getDeck().add(card1);
        deck.getDeck().add(card2);

        Assertions.assertEquals(2,deck.getDeck().size());

        deck.giveCards(1);

        Assertions.assertEquals(1, deck.getDeck().size());
        Assertions.assertEquals(1, deck.getCardsPlayed().size());

    }

    @Test
    public void verifyIfGiveCards() {

        Deck deck = new Deck();

        Card card1 = new Card(1,"Oro");
        Card card2 = new Card(2,"Oro");

        deck.getDeck().add(card1);
        deck.getDeck().add(card2);

        Assertions.assertEquals(2, deck.getDeck().size());
        Assertions.assertEquals(card1, deck.getDeck().get(0));
        Assertions.assertEquals(card2, deck.getDeck().get(1));

        List<Card> cardsExpected =  deck.giveCards(2);

        Assertions.assertEquals(card1, cardsExpected.get(0));
        Assertions.assertEquals(card2, cardsExpected.get(1));
        Assertions.assertEquals(0, deck.getDeck().size());
        Assertions.assertEquals(2, deck.getCardsPlayed().size());

    }

    @Test
    public void verifyNumberCardsAvailable() {

        Deck deck = new Deck();

        Card card1 = new Card(1,"Oro");
        Card card2 = new Card(2,"Oro");

        deck.getDeck().add(card1);
        deck.getDeck().add(card2);

        int numCardExpected = deck.cardsAvailable();

        Assertions.assertEquals(2, numCardExpected);

    }

    @Test
    public void verifyCardsPlayed() {

        Deck deck = new Deck();

        Card card1 = new Card(1,"Oro");
        Card card2 = new Card(2,"Oro");

        deck.getCardsPlayed().add(card1);
        deck.getCardsPlayed().add(card2);

        Assertions.assertEquals(2, deck.getCardsPlayed().size());
        Assertions.assertEquals(card1, deck.getCardsPlayed().get(0));
        Assertions.assertEquals(card2, deck.getCardsPlayed().get(1));

        List<Card> cardsPlayedExpected  = deck.cardsPlayedUntilNow();

        Assertions.assertEquals(card1, cardsPlayedExpected.get(0));
        Assertions.assertEquals(card2, cardsPlayedExpected.get(1));

    }
}
