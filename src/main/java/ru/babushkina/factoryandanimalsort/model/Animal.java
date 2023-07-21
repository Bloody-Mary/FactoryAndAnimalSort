package ru.babushkina.factoryandanimalsort.model;

public abstract class Animal implements Comparable<Animal> {
    private int age;
    private double weight;
    private Color color;
    private final Long id;
    private static Long currentId = 1L;

    public Animal(int age, double weight, Color color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.id = currentId++;
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

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}