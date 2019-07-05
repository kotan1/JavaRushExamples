package com.javarush.example.example04.article0406.ex01;

public class Main {

   public static void main(String[] args) {

      int x = 342;
      System.out.println(Integer.toBinaryString(x));
      System.out.println(~x);
      System.out.println(277&432);
      System.out.println(277|432);
      System.out.println(277^432);
      System.out.println("----------");

      x = 64;//значение
      int y = 3;//количество
      int z = (x << y);
      System.out.println(Integer.toBinaryString(x));
      System.out.println(Integer.toBinaryString(z));
      System.out.println(x);
      System.out.println(z);
      System.out.println("----------");

      x = 64;//значение
      y = 26;//количество
      z = (x << y);
      System.out.println(z);
      System.out.println(111111111 << 3);
      System.out.println("----------");

      x = 64;//значение
      y = 2;//количество
      z = (x >> y);
      System.out.println(z);

   }
}