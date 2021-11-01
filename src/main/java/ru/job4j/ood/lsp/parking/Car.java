package ru.job4j.ood.lsp.parking;

public class Car implements Transport {
    private final String name;
    private final int size;

    public Car(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
