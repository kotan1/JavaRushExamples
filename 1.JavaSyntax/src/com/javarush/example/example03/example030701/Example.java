package com.javarush.example.example03.example030701;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        name = reader.readLine();
        sAge = reader.readLine();
        nAge = Integer.parseInt(sAge);

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        int age1 = scanner.nextInt();
    }
}
