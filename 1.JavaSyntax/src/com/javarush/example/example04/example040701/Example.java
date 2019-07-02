package com.javarush.example.example04.example040701;

public class Example {
    public static void main(String[] args) {
        boolean m;
        m = false;
        int a = 3;
        int b = 2;

        if (a > b)
            System.out.println(a);

        m = (a > b);
        if (m)
            System.out.println(a);

        m = (a > b);
        if (m == true)
            System.out.println(a);
    }

    public boolean isALessThanB (int a, int b)
    {
//        if (a < b)
//            return true;
//        else
//            return false;

//        boolean m = (a < b);
//        if (m)
//            return true;
//        else
//            return false;

//        boolean m = (a < b);
//        return m;

        return a < b;

    }
}
