package com.javarush.example.example04.article0404.ex01;

public class Main {

   public static void main(String[] args) {

      int x = 999;
      int y = 33;

      System.out.println(x+y);
      System.out.println(x-y);
      System.out.println(x*y);
      System.out.println(x/y);
      System.out.println(x%y);
      System.out.println("----------");

      System.out.println(x=y);
      System.out.println("----------");

      x = 999;
      y = 33;
      System.out.println(x == y);
      System.out.println("----------");

      x = 999;
      y = 33;
      int z = 256;
      x = y = z;
      System.out.println(x);
      System.out.println("-----------");

      x = 999;
      //меняем знак первый раз
      x = -x;
      System.out.println(x);
      //меняем знак второй раз
      x= -x;
      System.out.println(x);

   }
}