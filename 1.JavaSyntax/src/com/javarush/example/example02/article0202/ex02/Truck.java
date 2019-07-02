package com.javarush.example.example02.article0202.ex02;

public class Truck {

   int length;
   int width;
   int height;

   int weight;
   public int getVolume() {
      int volume = length * width * height;
      return volume;
   }
}
