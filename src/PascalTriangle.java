public class PascalTriangle {
    public static void main(String[]args)
    {
        int a,b,c;
        for(a=1;a<=5;a++) {
            for (b = a; b <5; b++) {
                System.out.print(" ");
            }
            int e=1;
            for (c = 1; c <= a; c++) {
                System.out.print(e+" ");
                e =e*(a-c)/c;
            }
            System.out.println();
        }
    }
}
