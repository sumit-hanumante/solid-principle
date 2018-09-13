package open_closed_Principle.withOpenClosedPrinciple;

public class Circle implements Shape{
  public double radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public double calculateArea(){
    return (22/7)*radius*radius;
  }
}