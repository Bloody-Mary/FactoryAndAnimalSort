package ru.babushkina.factoryandanimalsort.model;

public abstract class Animal implements Comparable<Animal> {
    private int age;
    private double weight;
    private Color color;
    private final Long id;
    private static Long counterId = 1L;

    public Animal(int age, double weight, Color color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.id = counterId++;
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

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Animal other) {
        int ageComparison = Integer.compare(this.getAge(), other.getAge());
        if (ageComparison == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Наше животное:\n" +
                "ID: " + id + "\n" +
                "Вид: " + this.getClass().getSimpleName() + "\n" +
                "Возраст: " + age + " лет\n" +
                "Вес: " + String.format("%.2f", weight) + " кг\n" +
                "Цвет: " + color;
    }
}