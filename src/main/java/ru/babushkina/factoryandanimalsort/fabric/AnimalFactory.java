package ru.babushkina.factoryandanimalsort.fabric;

import ru.babushkina.factoryandanimalsort.model.*;
import java.util.Random;

public class AnimalFactory {
    private static AnimalFactory instance;
    private final Random random;

    private AnimalFactory() {
        random = new Random();
    }

    public static AnimalFactory getInstance() {
        if (instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }

    public Animal createAnimal(String type) {
        int age = random.nextInt(50) + 1;
        double weight = random.nextDouble() * 70;
        Color color = getRandomColor();
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog(age, weight, color);
            case "cat":
                return new Cat(age, weight, color);
            case "bear":
                return new Bear(age, weight, color);
            case "eagle":
                return new Eagle(age, weight, color);
            case "fox":
                return new Fox(age, weight, color);
            case "lion":
                return new Lion(age, weight, color);
            case "moose":
                return new Moose(age, weight, color);
            case "owl":
                return new Owl(age, weight, color);
            case "whale":
                return new Whale(age, weight, color);
            case "wolf":
                return new Wolf(age, weight, color);
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }

    private Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}