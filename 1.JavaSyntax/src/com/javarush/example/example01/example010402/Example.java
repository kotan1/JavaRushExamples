package com.javarush.example.example01.example010402;

public class Example {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);

        int b = 3;
        System.out.println(b);

        a = a + b;
        System.out.println(a);

        b = b + 1;
        System.out.println(b);

        String s1 = "Мама";
        String s2 = "Мыла";
        String s3 = s1 + s2 + "Раму";
        System.out.println(s3);

        String s4 = "Мой любимый фильм";
        String s5 = "Дорога";
        int roadNumber = 66;
        String text = s4 + " " + s5 + " " + roadNumber;
        System.out.println(text);

        System.out.println("Ты должен делать то, что должен");

        String s6 = "Ты должен делать то, что должен";
        System.out.println(s6);
    }
}
