package ru.yandex.lesson8;

public abstract class Animal {

    protected String name;
    private int age;

    public Animal() {
        System.out.println(this + " created");
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

    public abstract void say();

}
