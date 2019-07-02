package com.javarush.example.example04.example040601;

public class Cat {

   String name;
   int age;

   public Cat(String name){
      this.name = name;
   }

   public Cat(){

   }

   public void sayMeow() {
      System.out.println("Мяу!");
   }

   public void jump() {
      System.out.println("Прыг-скок!");
   }

   public static void main(String[] args) {
      Cat barsik = new Cat();
      barsik.age = 3;
      barsik.name = "Барсик";

      barsik.sayMeow();
      barsik.jump();

   }
}
