package com.javarush.example.example02.article0202.ex04;

public class Jarvis {

   public void sayHi(String name) {
      System.out.println("Добрый вечер, " + name + ", как ваши дела?");
   }

   public static void main(String[] args) {
      Jarvis jarvis = new Jarvis();
      jarvis.sayHi("Тони Старк");
   }
}
