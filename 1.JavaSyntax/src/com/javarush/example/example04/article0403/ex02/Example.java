package com.javarush.example.example04.article0403.ex02;

public class Example {
   public static void main(String[] args) {
      float f11 = 0.7f;
      float f12 = 0.3f + 0.4f;
      System.out.println("f1==f2: "+(f11==f12));

      float f21 = 0.3f;
      float f22 = 0.4f;
      float f23 = f21 + f22;
      float f24 = 0.7f;
      System.out.println("f1="+(double)f21);
      System.out.println("f2="+(double)f22);
      System.out.println("f3="+(double)f23);
      System.out.println("f4="+(double)f24);
      System.out.println("|f3-f4|<1e-6: "+( Math.abs(f23-f24) < 1e-6 ));

   }
}
