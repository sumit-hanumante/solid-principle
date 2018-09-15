package Liskov_substitution_principle.implementation_without_liskov_substitution;

public class Car extends TransportationDevice
{
   @Override
   void startEngine() {
      System.out.println("Car Engine Started");
   }
}