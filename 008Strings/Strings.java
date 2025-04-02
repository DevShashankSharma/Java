
public class Strings {
    public static void main(String[] args) {
        String name = "John Doe"; // String literal
        String name2 = new String("John Doe"); // String object
        System.out.println(name);
        System.out.println(name2);

        // concatenation
        String firstName = "John"; // String literal
        String lastName = "Doe"; // String literal
        String fullName = firstName + " " + lastName; // String literal
        System.out.println(fullName);

        // length
        String name3 = "John Doe"; // String literal
        int length = name3.length(); // String object
        System.out.println(length);

        // charAt
        String name4 = "John Doe"; // String literal
        char firstChar = name4.charAt(0); // String object
        System.out.println(firstChar);

        // indexOf
        String name5 = "John Doe"; // String literal
        int index = name5.indexOf("Doe"); // String object
        System.out.println(index);

        // compareTo
        String name6 = "John Doe"; // String literal
        String name7 = "John Doe"; // String literal
        if (name6.compareTo(name7) == 0) { // String object
            System.out.println("The names are the same."); // String object
        } else if (name6.compareTo(name7) > 0) { // String object
            System.out.println("name6 is greater than name7."); // String object
        } else { // String object
            System.out.println("name6 is less than name7."); // String object
        }

        // == 
        String name8 = "John Doe"; // String literal
        String name9 = "John Doe"; // String literal
        if (name8 == name9) { // String object
            System.out.println("The names are the same."); // String object
        }
    }
}
