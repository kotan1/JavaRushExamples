package com.javarush.example.example03.article0301.ex04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   public static void main(String[] args) throws IOException {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine();
      System.out.println("Мы считали с клавиатуры эту строку:");
      System.out.println(s);
   }
}