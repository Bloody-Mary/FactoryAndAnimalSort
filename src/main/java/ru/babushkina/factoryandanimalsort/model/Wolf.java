package ru.babushkina.factoryandanimalsort.model;

public class Wolf extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Волк: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}