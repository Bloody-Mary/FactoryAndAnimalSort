package ru.babushkina.factoryandanimalsort.model;

public class Cat extends Animal {
    @Override
    public void printInfo() {
        System.out.println("Кошка: (" + getId() + ") возрастом " + getAge() + ", весом " + getWeight() + " и цветом " + getColor());
    }
}
