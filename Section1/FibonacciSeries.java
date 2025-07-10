package Section1;

// Java Program to print the Fibonacci Series.

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int fibLength;

        // Use scanner class to get the user input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the fibonacci number: ");
        fibLength = sc.nextInt();
        sc.close();

        int[] num = new int[fibLength];

        // Assign values 0 and 1 to the 0 and 1 indices of the defined array
        num[0] = 0;
        num[1] = 1;

        // Logic for getting the values of all the indices of the array using for loop
        for (int i = 2; i < fibLength; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        System.out.println("Fibonacci series: ");
        for (int i = 0; i < fibLength; i++) {
            System.out.println(num[i] + " ");
        }
    }
    
}
