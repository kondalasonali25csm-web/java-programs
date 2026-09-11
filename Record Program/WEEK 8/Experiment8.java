import java.util.Scanner;

public class Experiment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take input from the user
        System.out.print("Enter Employee Id: ");
        String empId = scanner.next();

        // 2. Check the first letter of the Employee ID
        if (empId.startsWith("R") || empId.startsWith("r")) {
            // Regular Employee Calculation
            int basicPay = 25000;
            int hra = 15000;
            int ta = 5000;
            int totalAmount = basicPay + hra + ta;

            // Display Results
            System.out.println("Salary Details:");
            System.out.println("Basic Pay: " + basicPay);
            System.out.println("HRA: " + hra);
            System.out.println("T.A: " + ta);
            System.out.println("Total Amount: " + totalAmount);

        } else if (empId.startsWith("C") || empId.startsWith("c")) {
            // Contract Employee Calculation
            int basicPay = 12000;
            int ta = 3000;
            int totalAmount = basicPay + ta;

            // Display Results
            System.out.println("Salary Details:");
            System.out.println("Basic Pay: " + basicPay);
            System.out.println("T.A: " + ta);
            System.out.println("Total Amount: " + totalAmount);

        } else if (empId.startsWith("V") || empId.startsWith("v")) {
            // Vendor handling
            System.out.println("Vendors do not have a monthly fixed payroll.");
            
        } else {
            // Invalid ID handling
            System.out.println("Invalid Employee ID! Please start with R, C, or V.");
        }

        scanner.close();
    }
}

