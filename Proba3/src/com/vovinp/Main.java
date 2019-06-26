package com.vovinp;

public class Main {

    public static void main(String[] args) {
        Person bob = new Person();
        bob.info();

        // write your code here
    }
}

class Person {

    String name;
    int age;

    {
        name = "NoName";
        age = 999;
    }

    Person(String name) {
        this.name = name;
    }

    Person(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    void info() {
        System.out.printf(" Name is %s \tAge equal %d \n", name, age);
    }
}