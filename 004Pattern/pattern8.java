// Pattern 8
//         1 
//       2 1 2 
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j=i+1;j>0;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
