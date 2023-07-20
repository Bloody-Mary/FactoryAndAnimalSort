package ru.babushkina.factoryandanimalsort.model;

public class Animal {
    int age;
    double weight;
    Color color;
    long id;

    public Animal(int age, int weight, Color color, Long id) {
        this.id = nextId++;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Животное №" + id);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Цвет: " + color);
        System.out.println();
    }
    }
}
