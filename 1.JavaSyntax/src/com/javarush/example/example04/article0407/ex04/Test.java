package com.javarush.example.example04.article0407.ex04;

public class Test {
   public static void main(String[] args) {
      System.out.println("Пример:");
      int a = 7;
      int b = 5;
      int c = a | b;
      System.out.println(b);
      System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
      System.out.println("Представление числа: " + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
      System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
   }
}
