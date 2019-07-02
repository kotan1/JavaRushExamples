package com.javarush.example.example04.example040801;

public class Example {
    public static void main(String[] args) {
        int i = 3;
        while (i >= 0)
        {
            System.out.println(i);
            i--;    //уменьшение i на 1
        }

        System.out.println("----------");

        i = 0;
        while (i < 3)
        {
            System.out.println(i);
            i++;   //увеличение i на 1
        }
    }
}
