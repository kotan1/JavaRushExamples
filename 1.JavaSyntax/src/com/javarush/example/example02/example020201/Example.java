package com.javarush.example.example02.example020201;

public class Example {
    public static void main(String[] args) {
        String s1;
        String s2 = null;

        Person person;
        person = new Person();
        person = null;

        Cat cat = new Cat();
        cat.owner = new Person();
        cat.owner.name = "Tom";
    }

    public static class Person
    {
        String name;
        int age;
    }

    public static class Rectangle
    {
        int x, y, width, height;
    }

    public static class Cat
    {
        Person owner;
        Rectangle territory;
        int age;
        String name;
    }
}


