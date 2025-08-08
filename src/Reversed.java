import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        System.out.println("Reversed: " + reversed);
        if (input.equals(reversed.toString())) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
