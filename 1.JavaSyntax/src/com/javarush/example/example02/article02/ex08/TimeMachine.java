package com.javarush.example.example02.article02.ex08;

public class TimeMachine {

   public void goToFuture(int currentYear) {

      currentYear = currentYear+10;
   }

   public void goToPast(int currentYear) {

      currentYear = currentYear-10;
   }

   public static void main(String[] args) {

      TimeMachine timeMachine = new TimeMachine();
      int currentYear = 2018;

      System.out.println("Какой сейчас год?");
      System.out.println(currentYear);

      timeMachine.goToPast(currentYear);
      System.out.println("А сейчас?");
      System.out.println(currentYear);
   }
}
