package com.vovinp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = sum(1, 2, 3);
        int y = sum(5, 7, 9);
        int z = sum2(3, 4, 5, 6);
        System.out.printf(" x = %d  y = %d z= %d", x, y, z);


        /*        int nums[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }

        hallo();
        welcome();
        welcome();

        /*        int n = 10;

        int mas[] = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
            System.out.print(i);
        }
        System.out.println(" Next");
        for (int i : mas) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n");
        System.out.println(n);

/*
        int i, n = 1;
        int[] nums = new int[]{2, 3, 4, 10};

        for (i = 0; i < nums.length; i++) {
            if (nums[i] > 5) {
                System.out.println(i);
                System.out.println(nums[i]);
                break;
            }
        }

        do {
            n += 2;
            System.out.print(n);
        }
        while (n < 5);

        for (i = 1; i < 9; i++) {
            if (i == 3) {
                System.out.println("Oops ");
                break;
            }
            System.out.print(i);
        }

        /*int num = 4;
        switch (num) {

            case 1:
                System.out.println("Wath to..");
                break;
            case 4:
                System.out.println("What to f..");
                break;
            default:
                System.out.println("Hallo!!");
        }

        // Hier 1 test
        /*
        Scanner in = new Scanner(System.in);

//        System.out.print("input name: ");
//        String name = in.nextLine();
        System.out.println("pleas input age: ");
        int age = in.nextInt();
        System.out.println("input height: ");
        if (age > 5) {
            System.out.print("Hey, you are Big Man!");
        }
        else{
            System.out.println("You are baby :-)");
        }
//        float height = in.nextFloat();
//        System.out.printf("Your name: %s Age: %d height: %4.2f \n", name, age, height);
        in.close();
        */
        // write your code here
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static int sum2(int ...mas){
        int res = 0;
        for(int t = 0; t < mas.length; t++){
            res += mas[t];
        }
        return res;
    }

    static void hallo() {
        System.out.println("Hallo!");
    }

    static void welcome() {
        System.out.println("Welcome to hier!");
    }
}
