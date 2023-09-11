package org.example.service;

import org.example.entity.Dog;
import org.example.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class AdoptionService {

    List<Person> personList;
    List<Dog> dogList;

    public AdoptionService() {
        personList = new ArrayList<>();
        dogList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void addDogToTheList(Dog dog) {
        dogList.add(dog);
    }

    public void addPersonToList(Person person) {
        personList.add(person);
    }

    public boolean isDogInTheList(String name) {
        for (Dog dog : getDogList()) {
            if (dog.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void adoptDog(Person person, Dog dog) {
        if (person.getDogs() == null) {
            person.setDogs(new ArrayList<>());
        }

        person.getDogs().add(dog);
        dog.setAdopted(true);
    }


}
