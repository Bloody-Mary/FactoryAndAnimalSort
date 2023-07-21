package ru.babushkina.factoryandanimalsort.model;

public enum Color {
    YELLOW(80), WHITE(40), BROWN(60), BLACK(90);
    private final int popularity;

    Color(int popularity) {
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }
}
