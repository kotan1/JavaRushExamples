package com.javarush.example.example02.article0201.ex07;

public class Cat {

   public Cat() {
      System.out.println("Создали кота!");
   }

   public static void main(String[] args) {

      Cat barsik = new Cat(); //вот здесь сработал конструктор по умолчанию
   }
}
