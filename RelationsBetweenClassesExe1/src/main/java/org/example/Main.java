package org.example;

import org.example.entity.Dog;
import org.example.entity.Person;

/*
Español
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.

English
Create a program so that a Person can adopt a Dog. Let's count from two
classes. Dog, which will have as attributes: name, race, age and size; and the Person class with
attributes: name, surname, age, document and Dog.
Now we must create two People and two Dogs in the main. Then we're going to have to
think the necessary logic to assign each Person a Dog and finally, show from
the Person class, the information of the Dog and of the Person.
 */
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Lucy");
        person1.setSurname("Romano");
        person1.setAge(30);
        person1.setIdentificationDocument("AAA1554KLPOI");

        Person person2 = new Person();
        person2.setName("Oscar");
        person2.setSurname("Vazquez");
        person2.setAge(30);
        person2.setIdentificationDocument("AAA155PPPZT");

        Dog dog1 = new Dog("Flash", "Labrador", 1, "medium");
        Dog dog2 = new Dog("Babak", "Pitbull", 2, "medium");

        person1.setDog(dog1);
        person2.setDog(dog2);

        System.out.println(person1);
        System.out.println(person2);
    }
}