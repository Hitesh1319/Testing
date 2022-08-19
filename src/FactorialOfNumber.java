import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[]args)
    {
        System.out.println("Enter number to check factorial number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=1;
        for(int b=a;b>=1;b--)
        {
            c=c*b;
        }
        System.out.print("Factorial of "+a+" is "+c);
    }
}
