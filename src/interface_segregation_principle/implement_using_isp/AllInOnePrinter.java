package interface_segregation_principle.implement_using_isp;

/**
 * Created by sumit on 9/18/2018.
 */
public class AllInOnePrinter implements  IFax,IPrinter,IScanner {
    @Override
    public void Fax() {
        System.out.println("I can fax");
    }

    @Override
    public void Print() {
        System.out.println("I can print");
    }

    @Override
    public void Scan() {
        System.out.println("I can scan");
    }
}
