package Week4.InheritancePackage;

public class MyCalculation extends Calculation
{
    void multiplication(int x,int y)
    {
        int z=x*y;
        System.out.println("Multiplication of "+x+"*"+y+"="+z);
    }
    public static void main(String[]args)
    {
        int a=20,b=10;
        MyCalculation c=new MyCalculation();
        c.addition(a,b);
        c.substration(a,b);
        c.multiplication(a,b);
    }
}
