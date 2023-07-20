package ru.babushkina.factoryandanimalsort.model;

public class Moose extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Лось: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
