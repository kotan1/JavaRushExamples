package com.javarush.example.example05.article04.ex01;

public class Cat extends Animal {

   public Cat() {
      System.out.println("Отработал конструктор Cat!");
   }

   public static void main(String[] args) {
      Cat cat = new Cat();
   }
}
