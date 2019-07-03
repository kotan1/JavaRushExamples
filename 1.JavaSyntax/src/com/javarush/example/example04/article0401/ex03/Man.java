package com.javarush.example.example04.article0401.ex03;

public class Man {

   String dnaCode;

   public static void main(String[] args) {

      Man man1 = new Man();
      man1.dnaCode = "111122223333";

      Man man2 = new Man();
      man2.dnaCode = "111122223333";

      System.out.println(man1.equals(man2));
   }
}