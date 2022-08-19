public class DiamondP {
    public static void main(String[] args) {
        int a, b, c, d;
        for (a = 1; a <= 5; a++) {
            for (b = a; b <= 5; b++) {
                System.out.print(" ");
            }
            for (c = 1; c < a * 2; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (a = 5; a >= 1; a--) {
            for (b = 5; b >= a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c < a * 2; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}