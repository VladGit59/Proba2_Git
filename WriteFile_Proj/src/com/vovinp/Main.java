package com.vovinp;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String text = "Hello, how are you?  \n";
        try (FileOutputStream fos = new FileOutputStream("C://Java//FileTest1.txt", true);
                FileInputStream fin = new FileInputStream("C://Java//FileTest1.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been writen!");

            int i = -1;
            while ((i= fin.read()) != -1){
                System.out.print((char)i);
            }
            System.out.println("The End :-) ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
/*
        System.out.println("The file has been written!");

        try (FileInputStream fin = new FileInputStream("C://Java//FileTest1.txt")) {
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
*/
    }
}
