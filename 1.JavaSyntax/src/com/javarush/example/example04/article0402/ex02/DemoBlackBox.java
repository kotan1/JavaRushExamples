package com.javarush.example.example04.article0402.ex02;

public class DemoBlackBox {
   public static void main(String[] args) {
      BlackBox object1 = new BlackBox(5, 10);
      BlackBox object2 = new BlackBox(5, 10);

      System.out.println(object1.equals(object2)); // должно быть true
      System.out.println(object1.hashCode() == object2.hashCode()); // должно быть true
   }
}