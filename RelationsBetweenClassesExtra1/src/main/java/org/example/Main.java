package org.example;

import org.example.entity.Dog;
import org.example.entity.Person;
import org.example.service.AdoptionService;
import java.util.Scanner;

/*
Español
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.

English
Some improvements must now be made to the Dog and Person exercise. Our program will
having to reckon with many people and many dogs. The program should ask
each person, which dog according to its name, wants to adopt. Two people cannot adopt
to the same dog, if the person chose a dog that was already adopted, the
person.
Once the Person chooses the Dog that is assigned to him, at the end we must show all the
people with their respective dogs.
 */
public class Main {
    public static void main(String[] args) {

        AdoptionService adoptionService = new AdoptionService();
        Scanner read = new Scanner(System.in);

        //creating 4 persons
        Person person1 = new Person();
        person1.setName("Ana");
        person1.setSurname("Gomez");
        person1.setAge(18);
        person1.setIdentificationDocument("AAA1");
        adoptionService.addPersonToList(person1);

        Person person2 = new Person();
        person2.setName("Luana");
        person2.setSurname("Bent");
        person2.setAge(25);
        person2.setIdentificationDocument("AAA2");
        adoptionService.addPersonToList(person2);

        Person person3 = new Person();
        person3.setName("David");
        person3.setSurname("Rossi");
        person3.setAge(35);
        person3.setIdentificationDocument("AAA3");
        adoptionService.addPersonToList(person3);

        Person person4 = new Person();
        person4.setName("Ben");
        person4.setSurname("Smith");
        person4.setAge(50);
        person4.setIdentificationDocument("AAA4");
        adoptionService.addPersonToList(person4);

        //creating 8 dogs
        Dog dog1 = new Dog("Max", "Labrador Retriever", 3, "Large", false);
        adoptionService.addDogToTheList(dog1);

        Dog dog2 = new Dog("Bella", "Poodle", 5, "Small", false);
        adoptionService.addDogToTheList(dog2);

        Dog dog3 = new Dog("Rocky", "German Shepherd", 2, "Large", false);
        adoptionService.addDogToTheList(dog3);

        Dog dog4 = new Dog("Daisy", "Beagle", 4, "Medium", false);
        adoptionService.addDogToTheList(dog4);

        Dog dog5 = new Dog("Charlie", "Bulldog", 6, "Medium", false);
        adoptionService.addDogToTheList(dog5);

        Dog dog6 = new Dog("Lucy", "Shih Tzu", 7, "Small", false);
        adoptionService.addDogToTheList(dog6);

        Dog dog7 = new Dog("Duke", "Golden Retriever", 1, "Large", false);
        adoptionService.addDogToTheList(dog7);

        Dog dog8 = new Dog("Luna", "Siberian Husky", 2, "Large", false);
        adoptionService.addDogToTheList(dog8);

        //showing the dog list
        System.out.println(adoptionService.getDogList().toString());

        //attributing dogs to each person
        for (Person person : adoptionService.getPersonList()) {

            String answer;
            do {

                System.out.print("\n" + person.getName() + " " + person.getSurname() + ", choose a dog by name: ");
                String dogName = read.nextLine();

                //if the dog exist in the list
                if (adoptionService.isDogInTheList(dogName)) {

                    //entering the dog list looking for the name
                    for (Dog dog : adoptionService.getDogList()) {
                        if (dog.getName().equalsIgnoreCase(dogName)) {

                            //if dog is not adopted
                            if (!dog.isAdopted()) {
                                adoptionService.adoptDog(person, dog);
                                break;
                            } else {
                                System.out.println("Sorry, " + dog.getName() + " has already been adopted.");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.print("This dog doesn't exist in our list! Enter a valid one from the list: ");
                    dogName = read.nextLine();
                }

                System.out.print("Do you want another dog? Enter Y for yes and N for no:  ");
                answer = read.next().toLowerCase();

                while (!answer.equals("y") && !answer.equals("n")) {
                    System.out.print("Answer not valid, enter a new one: ");
                    answer = read.nextLine().toLowerCase();
                }

                read.nextLine();

            } while (answer.equals("y"));
        }

        for (Person person : adoptionService.getPersonList()) {
            System.out.println(person.toString());
        }
    }
}

