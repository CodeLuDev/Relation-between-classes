package org.example.entity;

import java.util.List;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String identificationDocument;
    private List<Dog> dogs;

    public Person() {
    }

    public Person(String name, String surname, int age, String identificationDocument, List<Dog> dogs) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identificationDocument = identificationDocument;
        this.dogs = dogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(String identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", identificationDocument='" + identificationDocument + '\'' +
                ", dogs=" + dogs +
                '}';
    }
}
