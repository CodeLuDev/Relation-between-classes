package org.example;

import org.example.entity.Card;
import org.example.entity.Deck;

import java.util.*;

/*
Español
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.

English
Make a deck of Spanish cards oriented to objects. A card has a number between 1
and 12 (8 and 9 are not included) and a suit (swords, clubs, gold and cups). This class should
contain a toString() method that returns the card number and suit. The deck will be
composed of a set of cards, exactly 40.
The operations that the deck can perform are:
• shuffle(): shuffles all cards randomly.
• nextCard(): returns the next card that is in the deck, when there are no more or
the end has been reached, the user is told that there are no more cards.
• cardsAvailable(): indicates the number of cards that can still be dealt.
• giveCards(): given a number of cards that they ask us for, we will return that number of cards.
cards. In case there are fewer letters than requested, we will not return anything, but
We must tell the user.
• cartasMonton(): we show those cards that have already been dealt, if none have been dealt
tell the user
• displayDeck(): displays all cards to the end. That is, if a card is drawn and
then the method is called, it will not show that first letter.
 */
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Deck deck = new Deck();
        List<String> palos = new ArrayList<>();

        palos.add("Oro");
        palos.add("Baston");
        palos.add("Espada");
        palos.add("Copa");

        //creating the deck
        for (int i=0; i<4; i++) {
            for (int j=1; j<13; j++) {
                if (!(j>7 && j<10)) {
                    Card card = new Card(j,palos.get(i));
                    deck.getDeck().add(card);
                }
                System.out.println(" ");
            }
        }

        int option;
        do {
            System.out.println("-----MENU-----");
            System.out.print("Chose a option:"
            +"\n1. Shuffle the deck"
            +"\n2. Give cards"
            +"\n3. Next card"
            +"\n4. Cards available"
            +"\n5. Cards played"
            +"\n6. Show the deck"
            +"\n7. Exit");
            System.out.print("\nEnter a valid option: ");
            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    deck.shuffle();
                    break;

                case 2:
                    System.out.print("How many cards do you want: ");
                    int numCards = read.nextInt();
                    if (deck.getDeck().size() >= numCards) {
                        deck.giveCards(numCards);
                        System.out.println("Your cards: " + deck.getCardsOnTheTable().toString());
                    } else {
                        System.out.println("You can't take more cards from the deck!");
                    }
                    break;

                case 3:
                    if (deck.getDeck().size() == 0) {
                        System.out.println("The is no next card on the deck!");
                    } else {
                        System.out.println("Next card: " + deck.nextCard().toString());
                    }
                    break;

                case 4:
                    System.out.println("Cards available now are: "+deck.cardsAvailable());
                    break;

                case 5:
                    if (deck.getCardsPlayed().size() == 0) {
                        System.out.println("There is no card played yet");
                    } else {
                        System.out.println("Cards played until now are: "+deck.cardsPlayedUntilNow());
                    }
                    break;

                case 6:
                    System.out.println("Showing the deck: " + deck.getDeck().toString());
                    break;

                case 7:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Option incorrect! Enter a valid one from the menu: ");
                    option = read.nextInt();
            }

        } while (option != 7);

    }
}