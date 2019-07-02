package com.javarush.example.example02.article0202.ex06;

public class Jarvis {

   public void sayHi(String...names) {

      for (String name: names) {
         System.out.println("Добрый вечер, " + name + ", как ваши дела?");
      }
   }

   public static void main(String[] args) {
      Jarvis jarvis = new Jarvis();
      jarvis.sayHi("Тони Старк", "Капитан Америка", "Черная Вдова", "Халк");
   }
}
