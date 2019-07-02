package com.javarush.example.example04.example040501;

public class Example {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a < b)
            System.out.println("a меньше b");

        if (a < b)
            System.out.println("a меньше b");
        else
            System.out.println("a больше b");

        if (a < b)
        {
            System.out.println("a меньше b");
            System.out.println("a меньше b");
        }
        else
        {
            System.out.println("a больше b");
            System.out.println("a больше b");
        }

        if (a < b && a < c)
            System.out.println("a минимальное из a, b, c");

        if (a < b || a < c)
            System.out.println("a или меньше b, или меньше c");

        if ( !(a < b) )
            System.out.println("b меньше либо равно a");
        else
            System.out.println("b больше a");

        if (a < b)
        {
            if (a < c)
                System.out.println("a – это минимум");
            else
                System.out.println("c – это минимум");
        }
        else
        {
            if (b < c)
                System.out.println("b – это минимум");
            else
                System.out.println("c – это минимум");
        }

        if (a <= b && a <= c)
            System.out.println("a – это минимум");
        else   if (b <= a && b <= c)
            System.out.println("b – это минимум");
        else   if (c <= a && c <= b)
            System.out.println("c – это минимум");
    }
}
