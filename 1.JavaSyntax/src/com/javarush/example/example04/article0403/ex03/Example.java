package com.javarush.example.example04.article0403.ex03;

public class Example {
   public static void main(String[] args) {
      float f1 = 0.0f/1.0f;
      float f2 = 0.0f/-1.0f;
      System.out.println("f1="+f1);
      System.out.println("f2="+f2);
      System.out.println("f1==f2: "+(f1==f2));
      float f3 = 1.0f / f1;
      float f4 = 1.0f / f2;
      System.out.println("f3="+f3);
      System.out.println("f4="+f4);

      int i1 = Float.floatToIntBits(f1);
      int i2 = Float.floatToIntBits(f2);
      System.out.println("i1 (+0.0):"+ Integer.toBinaryString(i1));
      System.out.println("i2 (-0.0):"+ Integer.toBinaryString(i2));
      System.out.println("i1==i2: "+(i1 == i2));

      float x = 0.0f/0.0f;
      System.out.println("x="+x);
      System.out.println("x==x: "+(x==x));
   }
}
