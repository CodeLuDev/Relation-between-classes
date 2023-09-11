package org.example.entity;

public class MovieViewer {

    private String name;
    private int age;
    private int moneyInTheWallet;

    public MovieViewer() {
    }

    public MovieViewer(String name, int age, int moneyInTheWallet) {
        this.name = name;
        this.age = age;
        this.moneyInTheWallet = moneyInTheWallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoneyInTheWallet() {
        return moneyInTheWallet;
    }

    public void setMoneyInTheWallet(int moneyInTheWallet) {
        this.moneyInTheWallet = moneyInTheWallet;
    }
}
