package com.javarush.example.example03.example030501;

public class Example {
    public static void main(String[] args) {
        Cat cat = new Cat();

        String text = "Cat is " + cat;
        System.out.println(text);

        int a = 5;
        text = "A is " + a;
        System.out.println(text);

        text = "Cat is " + cat + a;
        System.out.println(text);

        text = a + "Cat is " + cat + a;
        System.out.println(text);

        // text = cat + a + "Cat is " + cat + a; // error

        text = cat + (a + "Cat is ") + cat + a;
        System.out.println(text);
    }
}
