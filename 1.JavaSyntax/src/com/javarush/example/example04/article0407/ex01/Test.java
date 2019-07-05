package com.javarush.example.example04.article0407.ex01;

public class Test {
   public static void main(String[] args) {
      System.out.println("Пример работы с типом byte");
      byte a = 47;
      byte b = (byte) ~a;
      System.out.println(b);

      System.out.println("Пример работы с типом short");
      short c = 350;
      short d = (short) ~c;
      System.out.println(d);

      System.out.println("Пример работы с типом int");
      int e = 555555555;
      int f = ~e;
      System.out.println(f);

      System.out.println("Пример работы с типом long");
      long g = 111112222233333L;
      long h = ~g;
      System.out.println(h);
   }
}