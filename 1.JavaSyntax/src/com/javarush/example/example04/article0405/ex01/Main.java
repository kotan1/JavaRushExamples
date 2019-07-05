package com.javarush.example.example04.article0405.ex01;

public class Main {

   public static void main(String[] args)  {

      float f1 = 0.0f;
      for (int i=1; i <= 7; i++) {
         f1 += 0.1111111111111111;
      }
      System.out.println(f1);

      double f2 = 0.0;
      for (int i=1; i <= 7; i++) {
         f2 += 0.1111111111111111;
      }
      System.out.println(f2);

      double f3 = 0.0;
      for (int i=1; i <= 10; i++) {
         f3 += 0.1;
      }
      System.out.println(f3);

   }
}