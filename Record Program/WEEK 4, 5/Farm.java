package record;

abstract class Animal {
    private String name;
    private String home;
    private String food;
    private String sound;
  
    public Animal(String name, String home, String food, String sound) {
        this.name = name;
        this.home = home;
        this.food = food;
        this.sound = sound;
    }
  
    public void displayDetails() {
        System.out.println("--- " + name + " ---");
        System.out.println("Where I stay: " + home);
        System.out.println("What I eat  : " + food);
        System.out.println("Sound I make: \"" + sound + "!\"");
        System.out.println();
    }
}

// Subclass for Cow
class Cow extends Animal {
    public Cow() {
        super("Cow", "Barn / Pasture", "Grass and Hay", "Moo");
    }
}

// Subclass for Pig
class Pig extends Animal {
    public Pig() {
        super("Pig", "Pigsty / Pen", "Grains and Vegetables", "Oink");
    }
}

// Subclass for Horse
class Horse extends Animal {
    public Horse() {
        super("Horse", "Stable", "Hay and Oats", "Neigh");
    }
}

// Main class to run the application
public class Farm {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Farm!\n");

        // Creating objects of each animal
        Animal myCow = new Cow();
        Animal myPig = new Pig();
        Animal myHorse = new Horse();

        // Displaying details using polymorphism
        myCow.displayDetails();
        myPig.displayDetails();
        myHorse.displayDetails();
    }
}
