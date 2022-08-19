public class InverDiamondPattern {
        public static void main(String[]args)
        {
            int a,b,c,d;
            for(a=1;a<=5;a++)
            {
                for(b=a;b<=5;b++)
                {
                    System.out.print("*");
                }
                for(c=2;c<a*2;c++)
                {
                    System.out.print(" ");
                }
                for(d=a;d<=5;d++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(a=5;a>=1;a--)
            {
                for(b=5;b>=a;b--)
                {
                    System.out.print("*");
                }
                for(c=2;c<a*2;c++)
                {
                    System.out.print(" ");
                }
                for(d=5;d>=a;d--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

