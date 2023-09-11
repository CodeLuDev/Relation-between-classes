package org.example;

import org.example.entity.Game;
import org.example.entity.Player;
import org.example.entity.WaterRevolver;
import java.util.ArrayList;

/*
Español
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
mojar(): devuelve true si la posición del agua coincide con la posición actual
siguienteChorro(): cambia a la siguiente posición del tambor
toString(): muestra información del revolver (posición actual y donde está el agua)
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugado r), nombre (Empezara con Jugador más su ID, ´Jugador 1´ por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego

English
Play Russian water roulette game in Java. As many know, the game is about
a number of players, who, with a water revolver, which has a single charge of water,
it shoots and gets wet. The classes to be made of the game are the following:
Water Gun class: This class has the following attributes: current position (position
of the drum that is fired, there may be water or not) and water position (the position of the
drum where the water is). These two positions will be generated randomly.
Methods:
• fillRevolver(): puts the values of the current position and the position of the water. The values
they must be random.
• wet(): returns true if the position of the water matches the current position
• nextJet(): moves to the next drum position
• toString(): shows information about the gun (current position and where the water is)
Player Class: this class has the following attributes: id (represents the number of the
player), name (it will start with Player plus his ID, Player 1 for example) and wet (indicates
if the player is wet or not). The number of players will be decided by the user, but
it must be between 1 and 6. If it is not in this range, it will default to 6.
Methods:
• shot(Revolver r): the method, receives the water revolver and calls the methods of
dunk() and nextSquirt() of Revolver. The player takes aim, pulls the trigger and if the
revolver throws the water, the player gets wet. The wet attribute is set to false and the method
returns true, else false.
Game Class: this class has the following attributes: Players (set of Players) and
Stir
Methods:
• fillGame(ArrayList<Player>players, Shuffle r): this method receives the players
and the revolver to save them in the game attributes.
10
• round(): each round consists of a player pointing the water gun and
pull the trigger. If the revolver spills the water, the player gets wet and the game is over, otherwise
wet, it is passed to the next player until one gets wet. Yes or if someone has to
wet. At the end of the game, it must be shown which player got wet.
Think of the logic needed to do this, using the attributes of the Game class.
 */
public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        WaterRevolver waterRevolver = new WaterRevolver();

        ArrayList<Player> playersOutside = new ArrayList<>();
        Player player1 = new Player(1,"Player1",false);
        Player player2 = new Player(2,"Player2",false);
        Player player3 = new Player(3,"Player3",false);
        Player player4 = new Player(4,"Player4",false);
        Player player5 = new Player(5,"Player5",false);
        Player player6 = new Player(6,"Player6",false);

        playersOutside.add(player1);
        playersOutside.add(player2);
        playersOutside.add(player3);
        playersOutside.add(player4);
        playersOutside.add(player5);
        playersOutside.add(player6);

        game.fulfillGame(playersOutside, waterRevolver);

        game.getWaterRevolver().fillRevolver();
        System.out.println(game.getWaterRevolver().toString());
        game.round();

        System.out.println(game.getPlayers().toString());
    }
}