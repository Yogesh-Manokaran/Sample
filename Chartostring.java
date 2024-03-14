package sorting;

import java.util.Arrays;

public class Chartostring {
    public static void main(String[] args) {
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };

        String str = String.valueOf(charArray);

        System.out.println("Character array: " + Arrays.toString(charArray));
        System.out.println("Converted string: " + str);
    }
}


