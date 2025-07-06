package Section1;

// Java Program to swap two given Strings

public class StringSwap {

    public static void main(String[] args) {
        // Take two string s1 and s2 which we need to swap.
        String s1 = "Go";
        String s2 = "Live";

        // Combine both the strings s1 and s2 using the concatenation(+) operator
        s1 = s1 + s2;

        // Use the substring method to get the subset of the combined string
        s2 = s1.substring(0, s1.length() - s2.length()); //extracts string from index to value
        s1 = s1.substring(s2.length()); //extracts string from value to end
 
        System.out.println(s1);
        System.out.println(s2);
    }
}
