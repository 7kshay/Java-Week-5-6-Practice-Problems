import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Taking user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();

        // Define array to store multiplication results
        int totalMultiples = 10;
        int[] multiplicationTable = new int[totalMultiples];

        // Loop from 1 to 10 and store results in array
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the multiplication table from the array
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        input.close();
    }
}
```

**Output:**
```
Enter a number: 5
Multiplication Table of 5:
5 * 1 = 5
5 * 2 = 10
...
5 * 10 = 50