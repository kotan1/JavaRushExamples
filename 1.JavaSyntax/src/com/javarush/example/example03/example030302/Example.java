package com.javarush.example.example03.example030302;

public class Example {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska");

        System.out.println("Cat is " + cat);
        System.out.println("Cat is " + cat.toString());
        String catText = cat.toString();
        System.out.println("Cat is " + catText);
    }
}
