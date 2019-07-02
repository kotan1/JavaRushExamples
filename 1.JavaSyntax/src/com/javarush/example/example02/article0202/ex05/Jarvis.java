package com.javarush.example.example02.article0202.ex05;

public class Jarvis {

   public void sayHi(String firstGuest) {
      System.out.println("Добрый вечер, " + firstGuest + ", как ваши дела?");
   }

   public void sayHi(String firstGuest, String secondGuest) {
      System.out.println("Добрый вечер, " + firstGuest + ", " + secondGuest + ", как ваши дела?");
   }

   public static void main(String[] args) {
      Jarvis jarvis = new Jarvis();
      jarvis.sayHi("Тони Старк");
      jarvis.sayHi("Тони Старк", "Капитан Америка");
   }
}
