import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {

        // Fixed values stored as variables
        Scanner input = new Scanner(System.in);
        int totalStudents = 10;
        int[] studentAges = new int[totalStudents];

        // Take user input for all 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");

        // Loop through the array and check voting eligibility
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];

            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}
```

**Output:**
```
Enter age of student 1: 20
Enter age of student 2: 15
...
The student with the age 20 can vote.
The student with the age 15 cannot vote.