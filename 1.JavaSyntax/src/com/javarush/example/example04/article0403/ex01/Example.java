package com.javarush.example.example04.article0403.ex01;

public class Example {
   public static void main(String[] args) {
      String str11 = "string";
      String str12 = "string";
      System.out.println(str11==str12 ? "the same" : "not the same");
      System.out.println("----------");

      String str21 = "string";
      String str22 = "str";
      String str23 = "ing";
      System.out.println(str21==(str22+str23) ? "the same" : "not the same");
      System.out.println("----------");

      String str31 = "string";
      String str32 = new String("string");
      System.out.println(str31==str32 ? "the same" : "not the same");
      System.out.println("----------");

      String str41 = "string";
      String str42 = new String("string");
      System.out.println(str41.intern()==str42.intern() ? "the same" : "not the same");
      System.out.println("----------");

   }
}
