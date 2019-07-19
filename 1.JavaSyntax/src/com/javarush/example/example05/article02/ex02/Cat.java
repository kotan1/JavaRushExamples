package com.javarush.example.example05.article02.ex02;

class Cat{
   int age;
   int birthday;

   // Инициализируем переменные явно
   Cat(int i, int j) {
      age = i;
      birthday = j;
   }

   // Инициализируем переменные одним и тем значением
   Cat(int i) {
      this(i, i); // вызывается Cat(i, i);
   }

   // Присвоим значения по умолчанию 0
   Cat() {
      this(0); // вызывается Cat(0);
   }
}
