package open_closed_Principle.withoutImplementingOpenClosedPrinciple;

public class AreaCalculator{

  public double calculateRectangleArea(Rectangle rectangle){
    return rectangle.getHeight() *rectangle.getWidth();
  }

  public double calculateCircleArea(Circle circle){
    return (22/7)*circle.getRadius()*circle.getRadius();
  }


  // again if business require is to get area of another shape then we need to keep changing this class
}
