package ru.babushkina.factoryandanimalsort.model;

public enum Color {
    YELLOW(99),
    WHITE(78),
    BLACK(57),
    BROWN(36);
    private int popularity;

    Color(int popularity) {
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }
}
