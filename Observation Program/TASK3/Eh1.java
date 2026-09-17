package observation;

public class Eh1 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block "catches" the crash and handles it gently
            System.out.println(" You cannot divide a number by zero!");
        }
    }
}
