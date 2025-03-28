// pattern2.java  : Diamond Pattern
//         *   
//       * * * 
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *

public class pattern2 {

    public static void main(String[] args) {
        int n = 5;

        // upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half
        for (int i = n-1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
