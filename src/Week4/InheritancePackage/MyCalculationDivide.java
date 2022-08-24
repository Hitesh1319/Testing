package Week4.InheritancePackage;

public class MyCalculationDivide extends MyCalculation{
    void divide(int x,int y)
    {
        int z=x/y;
        System.out.println("Division of "+x+"%"+y+"="+z);
    }
    public static void main(String[]args)
    {
        int a=20;int b=10;
        MyCalculation d=new MyCalculation();
        d.addition(a,b);
        d.multiplication(a,b);
        d.substration(a,b);
        MyCalculationDivide e= new MyCalculationDivide();
        e.divide(a,b);
    }
}
