package com.javarush.example.example02.article01.ex05;

public class Cat {

   String name;
   int age;

   //конструктор для класса Cat
   public Cat(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public static void main(String[] args) {

      Cat barsik = new Cat("Barsik", 5);
   }
}
