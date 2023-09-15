public class Main {
    public static void main(String[] args) {
        // Hard code the value for input
        int numToExamine = 77;

        // Use the modulo operator (%) to check if the number is even or odd
        if (0 == (numToExamine % 2)) {
            System.out.println(numToExamine + " is Even.");
        } else {
            System.out.println(numToExamine + " is Odd.");
        }
    }
}