package open_closed_Principle.withoutImplementingOpenClosedPrinciple;

/**
 * Created by sumit on 9/14/2018.
 */
public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(30);
        rectangle.setWidth(50);

        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.calculateRectangleArea(rectangle);

        Circle circle = new Circle();
        circle.setRadius(10);
        areaCalculator.calculateCircleArea(circle);
    }
}
