package ru.babushkina.factoryandanimalsort.model;

public class Lion extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Лев: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
