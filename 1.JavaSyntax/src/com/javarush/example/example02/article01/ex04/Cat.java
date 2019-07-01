package com.javarush.example.example02.article01.ex04;

public class Cat {

   String name;
   int age;

   public static void main(String[] args) {
      Cat barsik = new Cat();

      System.out.println("Тут в программе в течение 2-х часов что-то происходит...");

      barsik.age = 3;
      barsik.name = "Барсик";

   }
}
