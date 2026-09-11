import java.util.Scanner;

public class PrimePalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        
        // Check both conditions using helper methods
        if (isPrime(number) && isPalindrome(number)) {
            System.out.println(number + " is a Prime Palindrome number.");
        } else {
            System.out.println(number + " is NOT a Prime Palindrome number.");
        }
        
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        
        // Loop from 2 up to the square root of the number for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; 
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        // Reverse the digits of the number
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            num = num / 10;
        }
        
        // If the reversed number matches the original, it is a palindrome
        return originalNum == reversedNum;
    }
}
