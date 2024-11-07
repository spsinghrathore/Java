import java.util.Scanner;

public class conversion {

    // Method to convert from one number system to another
    public static String convertNumber(String number, int fromBase, int toBase) {
        // Parse the number from the source base
        int decimalValue = Integer.parseInt(number, fromBase);

        // Convert it to the target base and return as a string
        return Integer.toString(decimalValue, toBase);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter the number you want to convert: ");
        String number = scanner.nextLine();

        // Take the base of the number input by the user
        System.out.print("Enter the base of this number (e.g., 2 for Binary, 10 for Decimal, 16 for Hexadecimal): ");
        int fromBase = scanner.nextInt();

        // Take the base the user wants to convert the number to
        System.out.print("Enter the base you want to convert to (e.g., 2 for Binary, 10 for Decimal, 16 for Hexadecimal): ");
        int toBase = scanner.nextInt();

        // Perform the conversion
        try {
            String result = convertNumber(number, fromBase, toBase);
            System.out.println("The converted number is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input or base provided. Please ensure the number matches the base.");
        }

        scanner.close();
    }
}
