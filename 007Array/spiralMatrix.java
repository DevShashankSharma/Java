public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 4, 5, 6, 7, 8 }, { 7, 8, 9, 10, 11 }, { 2, 3, 4, 5, 6 },
                { 9, 10, 11, 12, 13 } };

        int row = arr.length;
        int col = arr[0].length; 

        // print 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;


        System.out.print("{ ");
        while (startRow <= endRow && startCol <= endCol) {
            // 1st -> upper row
            for (int j = startCol ; j <= endCol ; j++){
                System.out.print(arr[startRow][j] + ", ");
            }
            startRow++;

            // 2nd -> right column
            for (int i = startRow; i <= endRow; i++){
                System.out.print(arr[i][endCol] + ", ");
            }
            endCol--;

            // 3rd -> lower row
            for (int j = endCol ; j >= startCol ; j--){
                System.out.print(arr[endRow][j] + ", ");
            }
            endRow--;

            // 4th -> left column
            for (int i = endRow; i >= startRow; i--){
                System.out.print(arr[i][startCol] + ", ");
            }
            startCol++;
        }
        System.out.println(" }");
    }
}
