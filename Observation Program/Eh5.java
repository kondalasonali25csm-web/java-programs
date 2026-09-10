package observation;

public class Eh5 {
    public static void main(String[] args) {
        String word = "Cat";
        try {
            char letter = word.charAt(5);
            System.out.println(letter);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(" That position does not exist!");
        }
    }
}
