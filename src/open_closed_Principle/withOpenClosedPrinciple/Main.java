package open_closed_Principle.withOpenClosedPrinciple;


public class Main {
    public static void main(String[] args) {

        Shape circle  = new Circle(21);

        Shape rectangle  = new Rectangle(12,21);

        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.calculateShapeArea(circle);
        areaCalculator.calculateShapeArea(rectangle);



    }

}
