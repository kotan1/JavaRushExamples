package com.javarush.example.example04.article0404.ex02;

public class Main {

   public static void main(String[] args) {

      int x = 999;
      x++;
      System.out.println(x);
      x--;
      System.out.println(x);
      System.out.println("----------");

      x = 999;
      int y = x++;
      System.out.println(y);
      System.out.println("----------");

      x = 999;
      y = x++;
      System.out.println(y);
      System.out.println(x);
      System.out.println("----------");

      x = 999;
      y = ++x;
      System.out.println(y);
      System.out.println("----------");

      x = 999;
      y = 33;
      x += y;
      System.out.println(x);
   }
}
