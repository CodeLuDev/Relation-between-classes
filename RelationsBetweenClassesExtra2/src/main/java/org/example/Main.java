package org.example;

import org.example.entity.Cinema;
import org.example.entity.Movie;
import org.example.entity.MovieViewer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Español
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.

English
They ask us to make a program about a cinema, which has a room with a set of seats
(8 rows by 6 columns). From Cinema we are interested in knowing the movie that is being played, the
hall with the spectators and the price of the ticket. Then, from the movies we are interested in knowing
the title, duration, minimum age and director. Finally, from the viewer, we are interested in knowing his
name, age and the money you have available.
To represent the room with the spectators we are going to use a matrix. the seats are
labeled by a letter and a number the A1 row starts at the bottom of the map as shown in
the board. We must also know if the seat is occupied by a spectator or not, if this
busy displays an X, but an empty space.
8AX | 8B X | 8C X | 8D | 8 E X | 8F X
7AX | 7B X | 7C X | 7D X | 7E | 7F X
6AX | 6B X | 6C | 6 D X | 6 E X | 6F
5AX | 5B X | 5C X | 5D X | 5 E X | 5FX
4AX | 4B X | 4C X | 4D X | 4 E X | 4FX
3AX | 3B X | 3C X | 3D | 3 E X | 3FX
2AX | 2B | 2C X | 2D X | 2 E X | 2F
1AX | 1BX | 1 C X | 1 D X | 1 E X | 1F X
A small simulation must be carried out, in which many spectators are generated and
place in the seats randomly (you cannot place a spectator where they are already
occupied the seat).
Spectators will be located one by one and to locate them keep in mind that only
You can seat a spectator if you have enough money to pay the ticket, if there is space
free in the room and if you have the required age to see the film. In case the seat is
busy you should find a free one.
At the end of the program we must show the table, we can show it with the letter and number of
each seat or just the Xs and empty spaces.
 */
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Cinema[][] cinema = new Cinema[8][6];
        Movie movie = new Movie("The Nun II",104,16,"Michael Chaves",5);

        //creating people
        List<MovieViewer> customersWaiting = new ArrayList<>();

        boolean finish = false;
        do {
            MovieViewer movieViewer = new MovieViewer();

            System.out.print("Name: ");
            movieViewer.setName(read.nextLine());

            System.out.print("Age: ");
            movieViewer.setAge(read.nextInt());

            System.out.print("How many money do you have?: ");
            movieViewer.setMoneyInTheWallet(read.nextInt());

            customersWaiting.add(movieViewer);

            System.out.print("Do you want to add another one (Y/N)?: ");
            String answer = read.next();

            if (answer.equalsIgnoreCase("n")) {
                finish = true;
            }

            read.nextLine();
        } while (!finish);

        for (MovieViewer viewer : customersWaiting) {
            System.out.print(viewer.getName() + "/");
        }


        //creating a room
        for (int i=7; i>=0; i--) {
            for (int j=0; j<6; j++) {
                cinema[i][j] = new Cinema();
            }
            System.out.println(" ");
        }

        //creating list letters of seating
        String[] lettersSeating = new String[6];
        lettersSeating[0] = "A";
        lettersSeating[1] = "B";
        lettersSeating[2] = "C";
        lettersSeating[3] = "D";
        lettersSeating[4] = "E";
        lettersSeating[5] = "F";

        //showing the room
        for (int i=7; i>=0; i--) {
            for (int j=0; j<6; j++) {
                boolean occupied = false;

                for (MovieViewer viewer : customersWaiting) {
                    if (viewer.getAge() >= movie.getMinimumAge() && viewer.getMoneyInTheWallet() >= movie.getPrice()) {
                        occupied = true;
                        customersWaiting.remove(viewer);
                        break;
                    }
                }

                if (j < 5) {
                    System.out.print((i + 1) + lettersSeating[j] + (occupied ? " X" : "  ") + " | ");
                } else {
                    System.out.print((i + 1) + lettersSeating[j] + (occupied ? " X" : "  ") + "  ");
                }
            }
            System.out.println(" ");
        }
    }
}