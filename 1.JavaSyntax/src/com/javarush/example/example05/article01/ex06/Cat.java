package com.javarush.example.example05.article01.ex06;

public class Cat {

   public Cat() {
      System.out.println("Создали кота!");
   }

   public static void main(String[] args) {

      Cat barsik = new Cat(); //вот здесь сработал конструктор по умолчанию
   }
}