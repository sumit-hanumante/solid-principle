package open_closed_Principle.withOpenClosedPrinciple;

public class Rectangle implements Shape{
  double height;
  double width;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea(){
    return height * width;
  }
}
