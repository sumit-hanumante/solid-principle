package Liskov_substitution_principle.implementation_withut_liskov_substitution;

public class Bicycle extends TransportationDevice
{
   @Override
   void startEngine() {
    /*problem!*/
    //we have to provide implementation of this method
      // which will not do anything.
      System.out.println("biCycle don't have Engine...!!");
   }
}