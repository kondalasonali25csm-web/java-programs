package observation;

public class Eh4 {
    public static void main(String[] args) {
        String invalidInput = "123Llama";

        try {
            int number = Integer.parseInt(invalidInput);
            System.out.println("Success! The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The text '" + invalidInput + "' is not a valid number.");
        }
    }
}

