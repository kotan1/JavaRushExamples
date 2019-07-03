package com.javarush.example.example04.example041101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws IOException {
        for (int i = 3; i >= 0; i--)
        {
            System.out.println(i);
        }

        System.out.println("----------");

        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
        }

        System.out.println("----------");

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        for (boolean isExit = false; !isExit; )
        {
            String s = buffer.readLine();
            isExit = s.equals("exit");
        }

//        for (; true; )
//            System.out.println("C");

        for (; true; )
        {
            String s = buffer.readLine();
            if (s.equals("exit"))
                break;
        }
    }
}
