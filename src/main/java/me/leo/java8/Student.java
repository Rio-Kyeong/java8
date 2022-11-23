package me.leo.java8;

public class Student {
    private int age;
    private String name;
    private String className;

    public Student(int number, String name, String className) {
        this.age = number;
        this.name = name;
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
