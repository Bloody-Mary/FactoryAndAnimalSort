package ru.babushkina.factoryandanimalsort._main;

import ru.babushkina.factoryandanimalsort.model.Animal;
import ru.babushkina.factoryandanimalsort.service.FactoryService;

import java.util.ArrayList;
import java.util.Collections;

public class _Main {
    public static void main(String[] args) {
        FactoryService factory = FactoryService.getInstance();
        ArrayList<Animal> animals = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Animal animal = factory.createAnimal();
            animals.add(animal);
        }

        System.out.println("Коллекция животных до сортировки:");
        for (Animal animal : animals) {
            animal.printInfo();
        }

        Collections.sort(animals);
        System.out.println("Отсортированная коллекция животных по возрастанию:");
        for (Animal animal : animals) {
            animal.printInfo();
        }
    }
}
