package interface_segregation_principle.vilation_of_isp;


public class Mobile  implements ISmartDevice{

    @Override
    public void Print() {
        System.out.println("Not supported");
    }

    @Override
    public void Fax() {
        System.out.println("Not supported");
    }

    @Override
    public void Scan() {
        System.out.println("Not supported");
    }

    @Override
    public void call() {
        System.out.println("I can call");
    }
}
