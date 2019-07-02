package com.javarush.example.example03.article0302.ex01;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
         "Люблю твой строгий, стройный вид,\n" +
         "Невы державное теченье,\n" +
         "Береговой ее гранит");
      String s = scanner.nextLine();
      System.out.println(s);
   }
}
