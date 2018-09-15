package Liskov_substitution_principle.with_liskov_substitution;

class DevicesWithoutEngines extends TransportationDevice
{  
   void startMoving() {
      System.out.println(".-|-. moving");
   }
}