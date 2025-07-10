package Section1;

// Java Program to print the sum of digits of a given integer.

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
