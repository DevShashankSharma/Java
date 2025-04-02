public class stringBuilder {
    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);

        // //char at index 5
        // char c = sb.charAt(3);
        // System.out.println(c);

        // //set char at index 5
        // sb.setCharAt(5, '!');
        // System.out.println(sb);


        // // insert char at index 5
        // sb.insert(5, '@');
        // System.out.println(sb);

        // // delete char at index 5
        // sb.deleteCharAt(5);
        // System.out.println(sb);

        // // replace char at index 5
        // sb.replace(5, 6, "!");
        // System.out.println(sb);

        // // delete a substring
        // sb.delete(5, 6);
        // System.out.println(sb);


        // Reverse a string
        for (int i = 0 ; i < sb.length()/2; i++) {
            char temp = sb.charAt(sb.length()-i-1);
            sb.setCharAt(sb.length()-i-1, sb.charAt(i));
            sb.setCharAt(i, temp);
        }
        System.err.println(sb);
    }
}