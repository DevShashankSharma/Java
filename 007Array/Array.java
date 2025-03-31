import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;

        // System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        // System.out.println("Length of array: " + marks.length);

        // // operation on array
        // int sum = 0;
        // for (int i = 0; i < marks.length; i++) {
        //     sum += marks[i];
        // }
        // System.out.println("Sum of marks: " + sum);
        // System.out.println("Average of marks: " + (sum / marks.length));

        // // predefined function on arrray like length
        // int[] marks1 = {10, 20, 30, 40, 50}; 


        Scanner sc = new Scanner(System.in);
        // // problem 1
        // System.out.print("Enter the no. of users : ");
        // int n = sc.nextInt();
        // String [] names = new String[n];

        // System.out.println("Enter the names of users : ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print("         Enter name of user " + (i + 1) + " : ");
        //     names[i] = sc.next();
        // }

        // for (int i = 0; i < n; i++) {
        //     System.out.println("Name of user " + (i + 1) + " is: " + names[i]);
        // }


        // // problem 2
        int[] arr = {43, 23, 45, 67, 89, 12, 34, 56, 78, 90, 11, 22, 33, 44, 55, 66, 77, 88, 99};
    
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }

        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);
        sc.close();

    }   
}
