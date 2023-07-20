package ru.babushkina.factoryandanimalsort.service;

import ru.babushkina.factoryandanimalsort.model.*;

import java.util.Random;

public class FactoryService {
    private static FactoryService instance;
    private Random random;
    private Long id;

    private FactoryService() {
        random = new Random();
        id = 1L;
    }

    public static FactoryService getInstance() {
        if (instance == null) {
            instance = new FactoryService();
        }
        return instance;
    }

    public Animal createAnimal() {
        int age = random.nextInt(10) + 1;
        int weight = random.nextInt(100) + 1;
        Color color = getRandomColor();
        Long animalId = id++;

        int animalType = random.nextInt(10);
        switch (animalType) {
            case 0:
                return new Dog(age, weight, color, animalId);
            case 1:
                return new Cat(age, weight, color, animalId);
            case 2:
                return new Owl(age, weight, color, animalId);
            case 3:
                return new Lion(age, weight, color, animalId);
            case 4:
                return new Bear(age, weight, color, animalId);
            case 5:
                return new Whale(age, weight, color, animalId);
            case 6:
                return new Moose(age, weight, color, animalId);
            case 7:
                return new Eagle(age, weight, color, animalId);
            case 8:
                return new Wolf(age, weight, color, animalId);
            case 9:
                return new Fox(age, weight, color, animalId);
            default:
                return null;
        }
    }

    private Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];

    }
}