// Hollow rectangle pattern
public class pattern2 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Print '*' for the first and last row, and first and last column
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for hollow part
                }
            }
            System.out.println();
        }
    }
}
