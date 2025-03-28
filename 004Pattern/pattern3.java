// right angle triangle 

public class pattern3 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                // System.out.print("* ");
                // System.out.print((i + 1) + " ");
                // System.out.print((j + 1) + " ");
                System.out.print((i + j + 1) + " ");
            }
            System.out.println();
        }
    }
}
