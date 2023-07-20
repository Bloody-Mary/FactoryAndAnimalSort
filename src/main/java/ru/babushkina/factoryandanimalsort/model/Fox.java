package ru.babushkina.factoryandanimalsort.model;

public class Fox extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Лиса: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
