package Liskov_substitution_principle.with_liskov_substitution;

public class TransportationDevice
{
  String name;
  double speed;

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
}