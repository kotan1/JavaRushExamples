package com.javarush.example.example05.article01.ex04;

public class Car {

   String model;
   int maxSpeed;

   public Car(String model, int maxSpeed) {
      this.model = model;
      this.maxSpeed = maxSpeed;
   }

   public static void main(String[] args) {
      Car bugatti = new Car("Bugatti Veyron", 407);
      //Car bugatti = new Car(); //ошибка!
      System.out.println(bugatti.model);
      System.out.println(bugatti.maxSpeed);
   }

}