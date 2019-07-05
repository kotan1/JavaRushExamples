package com.javarush.example.example04.article0407.ex09;

public class Test {
   public static void main(String[] args) {
      int a = -64;
      int b = 1;
      for (int i = 0; i < 7; i++) {
         System.out.println("Поделим: " + a + " на 2");
         int c = a >> b;
         System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
         System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
         System.out.println("Результат: " + c);
         a = c;
      }
   }
}