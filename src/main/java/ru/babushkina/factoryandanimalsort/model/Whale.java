package ru.babushkina.factoryandanimalsort.model;

public class Whale extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Кит: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
