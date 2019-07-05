package com.javarush.example.example04.article0403.ex04;

public class AutoboxingTest {

   private static final int numbers[] = new int[]{-129,-128,127,128};

   public static void main(String[] args) {
      for (int number : numbers) {
         Integer i1 = number;
         Integer i2 = number;
         System.out.println("number=" + number + ": " + (i1 == i2));
      }
   }
}
