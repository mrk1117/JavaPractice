package Section1;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 2; // You can change this number to test other values
        boolean isPrime = true;

        // Check if the number is less than 2, which are not prime numbers
        if (num < 2) {
            isPrime = false;
        } else {
            // Loop from 2 to the square root of the number
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false; // If divisible, it's not a prime number
                    break; // No need to check further
                }
            }

            // Output the result
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
