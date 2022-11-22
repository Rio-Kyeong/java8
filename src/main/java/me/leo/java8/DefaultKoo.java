package me.leo.java8;

public class DefaultKoo implements Koo {

    String name;

    public DefaultKoo(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
