import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {

        // Fixed values stored as variables
        Scanner input = new Scanner(System.in);
        String[] friendNames = {"Amar", "Akbar", "Anthony"};
        int totalFriends = 3;
        int[] ages = new int[totalFriends];
        double[] heights = new double[totalFriends];

        // Take user input for age and height
        for (int i = 0; i < totalFriends; i++) {
            System.out.println("\nEnter details for " + friendNames[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height (cm): ");
            heights[i] = input.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < totalFriends; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nThe youngest friend is " + friendNames[youngestIndex]
                + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + friendNames[tallestIndex]
                + " with height " + heights[tallestIndex] + " cm");

        input.close();
    }
}