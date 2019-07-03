package com.javarush.example.example04.article0401.ex05;

public class Main {

   public static void main(String[] args) {

      String s1 = "JavaRush - лучший сайт для изучения Java!";
      String s2 = new String("JavaRush - лучший сайт для изучения Java!");
      System.out.println(s1 == s2);
   }
}
