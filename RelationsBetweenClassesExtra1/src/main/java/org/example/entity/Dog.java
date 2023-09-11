package org.example.entity;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private String size;
    private boolean isAdopted;

    public Dog() {
    }

    public Dog(String name, String breed, int age, String size, boolean isAdopted) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.isAdopted = isAdopted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    @Override
    public String toString() {
        return "\nDog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", isAdopted=" + isAdopted +
                '}';
    }
}
