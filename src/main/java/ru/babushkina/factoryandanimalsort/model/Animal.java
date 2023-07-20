package ru.babushkina.factoryandanimalsort.model;

public abstract class Animal {
    int age;
    double weight;
    Color color;
    long id;

    public Animal() {
        this.id = nextId++;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void printInfo();
}
