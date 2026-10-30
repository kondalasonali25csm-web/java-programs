import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> a = new ArrayList<>();

        a.add("apple");
        a.add("banana");
        a.add("papaya");

        System.out.println(a);
        System.out.println("Contains apple: " + c.contains("apple"));
        System.out.println("Size: " + a.size());

        c.remove("apple");
        System.out.println(a);

        a.clear();
        System.out.println("Is Empty: " + a.isEmpty());
    }
}
