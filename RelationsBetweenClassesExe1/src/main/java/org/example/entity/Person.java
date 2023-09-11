package org.example.entity;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String identificationDocument;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String surname, int age, String identificationDocument, Dog dog) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identificationDocument = identificationDocument;
        this.dog = dog;
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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", identificationDocument='" + identificationDocument + '\'' +
                ", dog=" + dog +
                '}';
    }
}
