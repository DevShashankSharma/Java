import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // String[] arr = new String[n];
        // int len = 0;
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.next();
        //     len += arr[i].length();
        // }

        // // for (int i = 0; i < n; i++) {
        // //     len += arr[i].length();
        // // }

        // System.out.println(len);



        // 2

        // String original = "eabcdef";
        // String result = ""; 
        // System.out.println(original);

        // for (int i = 0; i < original.length(); i++){
        //     if (original.charAt(i) == 'e'){
        //         result += "i";
        //         continue;
        //     }
        //     result += original.charAt(i);
        // }

        // System.out.println(result);



        // 3
        String email = "A7d7b@example.com";
        String username = "";
        // String username = email.split("@")[0];

        // for (int i = 0; i < email.length(); i++){
        //     if (email.charAt(i) == '@'){
        //         break;
        //     }
        //     username += email.charAt(i);
        // }

        int index = email.indexOf("@");
        username = email.substring(0, index);
        System.out.println(username);

        sc.close();
    }
}