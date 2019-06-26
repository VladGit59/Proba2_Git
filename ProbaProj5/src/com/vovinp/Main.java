package com.vovinp;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Person bob = new Person("Bobik");
        bob.display();
        Employee anni = new Employee("Anni", "Apple");
        anni.display();
    }
}


class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this.name = "NoName";
    }

    protected String getname() {
        return name;
    }


    public void display() {
        System.out.printf("Name Person is %s \n", name);
    }
}

class Employee extends Person {

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public void display() {
        System.out.printf("Name Emp: %s\t work in company: %s\n", super.getname(), company);
    }
}