package Liskov_substitution_principle.with_liskov_substitution;

public class Bicycle extends DevicesWithoutEngines
{
   @Override
   void startMoving() {
      System.out.println("cycle start moving");
   }
}