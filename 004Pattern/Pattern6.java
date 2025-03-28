// Pattern 6 Rhombus Star Pattern

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;

        for ( int i = 0  ; i < n ; i++) {
            for ( int j = 0 ; j < n - i - 1 ; j++) {
                System.out.print("  ");
            }
            for ( int j = 0 ; j < n ; j++ ) {
                System.err.print("* ");
            }
            System.out.println();
        }
    }
}
