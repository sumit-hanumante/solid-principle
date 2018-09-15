package Liskov_substitution_principle.with_liskov_substitution;

public class Car extends DevicesWithEngines
{
   @Override
   void startEngine() {
      System.out.println("Car Engine Started");
   }
}