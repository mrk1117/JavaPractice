package Section1;

// Write a Java Program to reverse a String.
// The Input is : "Iamthebest"
// Output should be : "tsebehtmaI"

public class ReverseString {

    public static void main(String[] args) {
        String inputString = "Iamthebest";
        String outputString = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            outputString = outputString + inputString.charAt(i);
        }

        System.out.println("The string: " + inputString + " is reversed to: " + outputString);
    }
}