package ru.babushkina.factoryandanimalsort.model;

public class Eagle extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Орёл: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
