package com.vovinp;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Operationable operation1;
        operation1 = (x, y) -> x + y;

        Operationable operation2 = (x,y) -> x - y;


        int result = operation1.calculate(10,20);
        System.out.println(result);

        System.out.println(operation2.calculate(10,15));
    }
}

interface Operationable {
    int calculate(int x, int y);
}
