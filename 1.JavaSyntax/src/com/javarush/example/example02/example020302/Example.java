package com.javarush.example.example02.example020302;

public class Example {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat vaska = null;

        vaska = murzik;

        murzik = null;
    }

    public static class Cat
    {
        int age;
        String name;
    }
}


