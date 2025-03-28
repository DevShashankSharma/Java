// Pattern 1: solid rectangle
// Description: This pattern prints a solid rectangle of asterisks (*) with given number of rows and columns.

// Example: For 5 rows and 5 columns, the output will be:
// ********
// ********
// ********
// ********
// ********
public class pattern1 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
