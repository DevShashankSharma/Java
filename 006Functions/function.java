import java.util.Scanner;

public class function {
    public static void printMessage(String message) {
        System.out.println(message);
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        printMessage(message);
        scanner.close();
        return;
    }
}
