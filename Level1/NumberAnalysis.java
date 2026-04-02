import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        // Fixed values stored as variables
        Scanner input = new Scanner(System.in);
        int totalNumbers = 5;
        int[] numbers = new int[totalNumbers];

        // Take user input for all 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nNumber Analysis Results:");

        // Loop through the array and check each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare first and last elements
        int firstElement = numbers[0];
        int lastElement = numbers[totalNumbers - 1];

        System.out.println("\nComparing first and last elements:");
        if (firstElement == lastElement) {
            System.out.println("The first element " + firstElement + " is equal to the last element " + lastElement);
        } else if (firstElement > lastElement) {
            System.out.println("The first element " + firstElement + " is greater than the last element " + lastElement);
        } else {
            System.out.println("The first element " + firstElement + " is less than the last element " + lastElement);
        }

        input.close();
    }
}