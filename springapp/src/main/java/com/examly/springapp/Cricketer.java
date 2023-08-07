package com.examly.springapp;

public class Cricketer implements Comparable<Cricketer> {
    private String name;
    private int age;
    private String country;

    public Cricketer(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int compareTo(Cricketer other) {
        return this.name.compareTo(other.name);
    }
}