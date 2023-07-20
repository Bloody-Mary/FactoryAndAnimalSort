package ru.babushkina.factoryandanimalsort.model;

public class Owl extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Сова: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
