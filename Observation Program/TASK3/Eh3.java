package observation;

public class Eh3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            System.out.println("value"+ numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Caught! You tried to access an index that doesn't exist.");
        }
    }
}
