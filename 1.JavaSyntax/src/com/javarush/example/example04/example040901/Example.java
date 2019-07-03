package com.javarush.example.example04.example040901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws IOException {
        int i = 3;
        while (i >= 0)
        {
            System.out.println(i);
            i--;
        }

        System.out.println("----------");

        i = 0;
        while (i < 3)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("----------");

        boolean isExit = false;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (!isExit)
        {
            String s = buffer.readLine();
            isExit = s.equals("exit");
        }

//        while (true)
//            System.out.println('C');

        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("exit"))
                break;
        }
    }
}
