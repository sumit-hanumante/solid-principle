package Liskov_substitution_principle.with_liskov_substitution;

class DevicesWithEngines extends TransportationDevice
{  
   Engine engine;

   public Engine getEngine() {
      return engine;
   }

   public void setEngine(Engine engine) {
      this.engine = engine;
   }

   void startEngine() {
      System.out.println("Engine started");
   }

}