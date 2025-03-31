import java.util.Scanner;

class Array2D {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0 ; i < row ; i++) {
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // print 
        for (int i = 0 ; i < row ; i++) {
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.print("Enter the search element : ");
        int search = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] == search){
                    System.out.println("Number found at :(" + i + "," + j + ") position");
                }
            }
        }

        // transpose of 2d array
        for (int i = 0 ; i < row ; i++) {
            for (int j = 0; j < col; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}