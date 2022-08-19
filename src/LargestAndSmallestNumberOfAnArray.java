import java.util.Scanner;
public class LargestAndSmallestNumberOfAnArray {
    public static void main(String[]args)
    {
        System.out.println("Enter number you want to add in an array");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b;
        int []c=new int[a];
        int large,small;
        System.out.println("Please enter numbers");
        for(b=0;b<a;b++)
        {
            c[b]=s.nextInt();
        }
        large=c[0];
        small=c[0];
        System.out.println("You entered");
        for(b=0;b<a;b++)
        {
            System.out.println(c[b]);
            if(c[b]>large)
            {
                large=c[b];
            }
            if(c[b]<small)
            {
                small=c[b];
            }
        }
        System.out.println("Largest number is="+large);
        System.out.println("Smallest number is="+small);
    }
}

