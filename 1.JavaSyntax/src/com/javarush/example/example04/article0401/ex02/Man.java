package com.javarush.example.example04.article0401.ex02;

public class Man {

   int dnaCode;

   public static void main(String[] args) {

      Man man1 = new Man();
      man1.dnaCode = 1111222233;

      Man man2 = new Man();
      man2.dnaCode = 1111222233;

      System.out.println(man1 == man2);
   }
}
