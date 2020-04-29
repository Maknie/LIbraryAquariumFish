package com.epam;

public class Fish {
    private String name;
    private int age;
    private String color;
    int id;

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public Fish() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fish(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color= color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fish " + name +
                " is " + age +" years old" +
                " has " + color + " color";
    }
}
