package observation;
import java.util.Scanner;
class StudentInformation{
    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Marks in Subject 1: ");
        int mark1 = sc.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        int mark2 = sc.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        int mark3 = sc.nextInt();
        int total = mark1 + mark2 + mark3;
        double percentage = total / 3.0;
        System.out.println("\n----- Student Information -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks      : " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total      : " + total);
        System.out.printf("Percentage : %.2f%%\n", percentage);
        sc.close();
    }

    void evenodd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
        sc.close();
    }

    void largestofthree(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Largest Number = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number = " + b);
        } else {
            System.out.println("Largest Number = " + c);
        }
        sc.close();
    }

    void gradecal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage: ");
        double percentage = sc.nextDouble();
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        sc.close();
    }

    void days(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day Number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day Number!");
        }
        sc.close();
    }

    void tables(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }

    void numbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.println("Numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    void  sumofnaturals(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers = " + sum);
        sc.close();
    }

    void fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    boolean prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    double areaofcircle(double radius) {
        return Math.PI * radius * radius;
    }
}

public class StudentUtilityProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentInformation si = new StudentInformation();
        System.out.println("1.Student details  2.even or odd  3.largest of 3  4.grade  5.days  6.tables  7.numbers");
        System.out.println("8.sum of natural nos.  9.fibonacci  10.factorial 11.prime  12.max of 2  13.area of circle  14.exit");
        System.out.println("select an choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                si.details();
                break;
            case 2:
                si.evenodd();
                break;
            case 3:
                si.largestofthree();
                break;
            case 4:
                si.gradecal();
                break;
            case 5:
                si.days();
                break;
            case 6:
                si.tables();
                break;
            case 7:
                si.numbers();
                break;
            case 8:
                si.sumofnaturals();
                break;
            case 9:
                si.fibonacci();
                break;
            case 10:
                System.out.print("Enter a number: ");
                int factNum = sc.nextInt();
                System.out.println("Factorial = " + si.factorial(factNum));
                break;
            case 11:
                System.out.print("Enter a number: ");
                int primeNum = sc.nextInt();
                if (si.prime(primeNum))
                    System.out.println(primeNum + " is Prime.");
                else
                    System.out.println(primeNum + " is Not Prime.");
                break;
            case 12:
                System.out.print("Enter two numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("Maximum = " + si.max(x, y));
                break;
            case 13:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area = " + si.areaofcircle(radius));
                break;
            case 14:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}
