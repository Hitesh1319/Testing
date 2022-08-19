public class PrintingNameInFirstAndLastColumn {
    public static void main(String[]args)
    {
        String a="Hitesh";
        int b,c,d,e;
        for(b=0;b<a.length();b++)
        {
            for(c=1;c<=1;c++)
            {
                System.out.print(a.charAt(b));
            }
            for(d=1;d<=5;d++)
            {
                System.out.print(" ");
            }
            for(e=1;e<=1;e++)
            {
                System.out.print(a.charAt(b));
            }
            System.out.println();
        }
    }
}

