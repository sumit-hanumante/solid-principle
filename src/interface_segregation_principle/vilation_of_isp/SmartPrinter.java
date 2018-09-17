package interface_segregation_principle.vilation_of_isp;


public class SmartPrinter implements  ISmartDevice {
    @Override
    public void Print() {
        System.out.println("I can print");
    }

    @Override
    public void Fax() {
        System.out.println("I can fax");
    }

    @Override
    public void Scan() {
        System.out.println("I can scan");
    }

    @Override
    public void call()  {
        System.out.println("Not supported");
    }
}
