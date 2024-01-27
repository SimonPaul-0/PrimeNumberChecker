import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number to check
        System.out.print("Enter a number to check if it's prime: ");
        int numberToCheck = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(numberToCheck);

        // Display the result
        if (isPrime) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
