package com.javarush.example.example02.example020301;

public class Example {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat vaska = new Cat();

        vaska = murzik;
    }

    public static class Cat
    {
        int age;
        String name;
    }
}


