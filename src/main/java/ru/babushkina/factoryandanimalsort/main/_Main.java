package ru.babushkina.factoryandanimalsort.main;

import ru.babushkina.factoryandanimalsort.model.Animal;
import ru.babushkina.factoryandanimalsort.model.AnimalType;
import ru.babushkina.factoryandanimalsort.service.AnimalFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        AnimalFactory animalFactory = AnimalFactory.getInstance();

        for (AnimalType animalType : AnimalType.values()) {
            Animal animal = animalFactory.createAnimal(animalType.name().toLowerCase());
            animals.add(animal);
        }

        System.out.println("Заполненная коллекция животных:");
        for (Animal animal : animals) {
            System.out.println("Наше животное имеет следующие характеристики:");
            System.out.println("ID: " + animal.getId());
            System.out.println("Вид: " + animal.getClass().getSimpleName());
            System.out.println("Возраст: " + animal.getAge() + " лет");
            System.out.println("Вес: " + String.format("%.2f", animal.getWeight()) + " кг");
            System.out.println("Цвет: " + animal.getColor());
            System.out.println("--------------------");
        }

        animals.sort(Comparator.comparingInt(Animal::getAge));
        System.out.println("Отсортированная коллекция животных по возрастанию:");
        for (Animal animal : animals) {
            System.out.println("Наше животное:");
            System.out.println("ID: " + animal.getId());
            System.out.println("Тип: " + animal.getClass().getSimpleName());
            System.out.println("Возраст: " + animal.getAge() + " лет");
            System.out.println("Вес: " + String.format("%.2f", animal.getWeight()) + " кг");
            System.out.println("Цвет: " + animal.getColor());
            System.out.println("--------------------");
        }
    }
}
