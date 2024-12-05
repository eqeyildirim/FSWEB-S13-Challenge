package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 100),
    PREMIUM("Premium Plan", 200),
    ENTERPRISE("Enterprise Plan", 300);

    private final String name;
    private final Integer price;

    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
