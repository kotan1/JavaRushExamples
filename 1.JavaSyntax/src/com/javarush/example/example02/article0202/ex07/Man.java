package com.javarush.example.example02.article0202.ex07;

public class Man {


   public static void sayYourAge(String greeting, int age) {
      System.out.println(greeting + " " + age);
   }

   public static void main(String[] args) {

      sayYourAge("Мой возраст - ", 33);
      //sayYourAge(33, "Мой возраст - "); //ошибка!
   }
}
