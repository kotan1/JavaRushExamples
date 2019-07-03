package com.javarush.example.example04.article0401.ex08;

public class Main {

   public static void main(String[] args) {

      String s1 = "JavaRush - лучший сайт для изучения Java!";
      String s2 = new String("JAVARUSH - ЛУЧШИЙ САЙТ ДЛЯ ИЗУЧЕНИЯ JAVA!");
      System.out.println(s1.equals(s2));
   }
}