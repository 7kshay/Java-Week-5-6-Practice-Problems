import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Fixed values stored as variables
        Scanner input = new Scanner(System.in);
        String companyName = "Zara";
        int totalEmployees = 10;
        double bonusRateHigh = 0.05;
        double bonusRateLow = 0.02;
        int yearsThreshold = 5;

        // Arrays to store employee data
        double[] salaries = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonusAmounts = new double[totalEmployees];
        double[] newSalaries = new double[totalEmployees];

        // Variables to store totals
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Take user input with validation
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            System.out.print("Enter salary: ");
            salaries[i] = input.nextDouble();
            if (salaries[i] <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--;
                continue;
            }

            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();
            if (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--;
                continue;
            }
        }

        // Calculate bonus and new salary for each employee
        for (int i = 0; i < totalEmployees; i++) {
            if (yearsOfService[i] > yearsThreshold) {
                bonusAmounts[i] = salaries[i] * bonusRateHigh;
            } else {
                bonusAmounts[i] = salaries[i] * bonusRateLow;
            }

            newSalaries[i] = salaries[i] + bonusAmounts[i];
            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print results for each employee
        System.out.println("\n--- " + companyName + " Employee Bonus Report ---");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i]
                    + ", Bonus = " + bonusAmounts[i]
                    + ", New Salary = " + newSalaries[i]);
        }

        // Print totals
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}