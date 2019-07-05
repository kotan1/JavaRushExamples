package com.javarush.example.example04.article0404.ex03;

public class Main {

   public static void main(String[] args) {

      boolean x = true;
      System.out.println(!x);
      System.out.println("----------");

      System.out.println(100 > 10 && 100 > 200);
      System.out.println(100 > 50 && 100 >= 100);
      System.out.println(100 > 10 || 100 > 200);
   }
}