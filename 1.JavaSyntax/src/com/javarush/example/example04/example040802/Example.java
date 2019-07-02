package com.javarush.example.example04.example040802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean isExit = false;

        while (!isExit)
        {
            String s = buffer.readLine();
            isExit = s.equals("exit");
        }

        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("exit"))
                break;
        }
    }
}
