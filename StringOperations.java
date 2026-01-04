import java.util.Scanner;

class StringOperations {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine(); //Java programming

        System.out.println("Length: " + s.length());
        System.out.println("Is Empty: " + s.isEmpty());
        System.out.println("Char At 2: " + s.charAt(2));
        System.out.println("To String: " + s.toString());

        System.out.println("Equals: " + s.equals("Java"));
        System.out.println("Compare To: " + s.compareTo("Java"));
        System.out.println("Contains: " + s.contains("Java"));

        System.out.println("Index Of 'a': " + s.indexOf('a'));
        System.out.println("Last Index Of 'a': " + s.lastIndexOf('a'));

        System.out.println("Starts With '  Ja': " + s.startsWith("  Ja"));
        System.out.println("Ends With '  ': " + s.endsWith("  "));

        System.out.println("Matches: " + s.matches(".*Java.*"));
        System.out.println("Substring: " + s.substring(2, 6));

        System.out.println("To Lower Case: " + s.toLowerCase());
        System.out.println("Trim: '" + s.trim() + "'");

        System.out.println("Replace: " + s.replace("Java", "Core"));

        String[] parts = s.trim().split(" ");
        System.out.println("Split:");
        for (String p : parts) {
            System.out.println(p);
        }

        System.out.println("Join: " + String.join("-", parts));
        System.out.println("Value Of: " + String.valueOf(123));
    }
}