import java.util.Scanner;
public class PrimeNumber {
    public static void main(String []args)
    {
        System.out.println("Enter a number to check whether it is prime number or not");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int c=0;
        for(int b=1;b<a;b++)
        {
            if(a%b==0)
            {
                c++;
            }
        }
        if(c==1)
        {
            System.out.print("Prime number");
        }
        else
        {
            System.out.print("Not a prime number");
        }
    }
}
