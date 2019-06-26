package com.vovinp;

public class Main {

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
    }
}

class Person {

    private String name;

    public String getName() {
        return name;
    }

    public Person(String name_Person) {

        this.name = name_Person;
    }

    public void display() {

        System.out.printf("Person %s \n", name);
    }
}

class Employee extends Person {

    private String company;

    public Employee(String name, String company) {

        super(name);
        this.company = company;
    }

    @Override
    public void display() {

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}