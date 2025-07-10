package Section1;

// An Armstrong Number is a number in which the sum of the cubes of each digit is equal to the number itself. 
// For ex: 371 = 3*3*3 + 7*7*7 + 1*1*1
// The sum of the cubes is 3,7,1 is equal to 371.Another example is 153 which is an Armstrong number.

public class ArmstrongNumber {
    
    public static void main(String[] args) {
        int num = 153; // You can change this number to test other values
        int originalNum = num;
        int sum = 0;

        // Loop through each digit of the number
        while (num > 0) {
            int lastDigit = num % 10; // Get the last lastDigit
            sum += lastDigit * lastDigit * lastDigit; // Add the cube of the digit to sum
            num /= 10; // Remove the last digit
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
