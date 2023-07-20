package ru.babushkina.factoryandanimalsort.model;

public class Dog extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Собака: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
