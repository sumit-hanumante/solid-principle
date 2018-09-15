package Liskov_substitution_principle.implementation_without_liskov_substitution;

 public class TransportationDevice
{
   String name;
   double speed;
   Engine engine;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getSpeed() {
      return speed;
   }

   public void setSpeed(double speed) {
      this.speed = speed;
   }

   public Engine getEngine() {
      return engine;
   }

   public void setEngine(Engine engine) {
      this.engine = engine;
   }

   void startEngine() {

      // lines of <code>
      System.out.println(" engine started");
   }
}