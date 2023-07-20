package ru.babushkina.factoryandanimalsort.model;

public class Bear extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Медведь: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
