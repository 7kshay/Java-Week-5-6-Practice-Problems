import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        // Taking user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Work with absolute value to handle negative numbers
        long absoluteNumber = Math.abs(number);

        // Find the count of digits in the number
        String numberString = Long.toString(absoluteNumber);
        int digitCount = numberString.length();

        // Find the digits in the number and save them in an array
        int[] digits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }

        // Find the frequency of each digit using a frequency array of size 10
        int frequencyArraySize = 10;
        int[] frequency = new int[frequencyArraySize];

        // Loop through digits array and increase frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit in " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
```

**Output:**
```
Enter a number: 122333
Frequency of each digit in 122333:
Digit 1 appears 1 time(s)
Digit 2 appears 2 time(s)
Digit 3 appears 3 time(s)