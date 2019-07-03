package com.javarush.example.example04.example041201;

public class Example {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("----------");

        for (int i = 1; i <= 10; i = i + 2)
        {
            System.out.println(i);
        }

        System.out.println("----------");

        for (int i = 10; i >= 0; i= i - 2)
        {
            System.out.println(i);
        }
    }
}
