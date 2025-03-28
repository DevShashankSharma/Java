import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        // switch statement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-5): ");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("You entered one.");
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("You entered two.");
                break;
            case 3:
                System.out.println("You entered three.");
                break;
            case 4:
                System.out.println("You entered four.");
                break;
            case 5:
                System.out.println("You entered five.");
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 5.");
        }

        sc.close();
    }
}
