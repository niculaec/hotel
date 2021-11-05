package com.company;

public class Guest {String name;
    Double money;

    public Guest(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public Guest() {

    }

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
