package observation;

public class Eh2 {
    public static void main(String[] args) {
        String name = null; // This variable points to nothing
        try {
            System.out.println("The length of the name is: " + name.length());
        } catch(NullPointerException e) {
            System.out.println("string is null");
        }
    }
}