package interface_segregation_principle.implement_using_isp;

class EconomicPrinter implements IPrinter{
    public void Print()
    {
        System.out.println("I am ready to print");
    }
}