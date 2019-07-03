package com.javarush.example.example04.article0401.ex09;

public class Main {

   public static void main(String[] args) {

      String address1 = "г. Москва, ул. Академика Королева, дом 12";
      String address2 = new String("Г. МОСКВА, УЛ. АКАДЕМИКА КОРОЛЕВА, ДОМ 12");
      System.out.println(address1.equalsIgnoreCase(address2));
   }
}
