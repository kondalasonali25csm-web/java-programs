package observation;
class Book {
    int bookId;
    String bookName;
    String author;
    double price;
    void display() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author    : " + author);
        System.out.println("Price     : " + price);
    }
}

class Book1 {
    // Private data members (Encapsulation)
    private int bookId;
    private String bookName;
    private String author;
    private double price;
    // Default Constructor
    public Book1() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    // Parameterized Constructor
    public Book1(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
    // Getter Methods
    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    // Setter Methods
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
class Student extends Person {
    int rollNo;
    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }
    void displayStudent() {
        displayPerson();
        System.out.println("Roll No : " + rollNo);
    }
}
class Faculty extends Person {
    String subject;
    Faculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void displayFaculty() {
        displayPerson();
        System.out.println("Subject : " + subject);
    }
}

class Area {
    double circleArea(double radius) {
        return 3.14 * radius * radius;
    }
    int rectangleArea(int length, int breadth) {
        return length * breadth;
    }
    double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
class Vehicle {
    void display() {
        System.out.println("This is a Vehicle.");
    }
}
class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car.");
    }
}
class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike.");
    }
}

abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
interface Printable {
    void print();
}
class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Report...");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b = new Book();
        b.bookId = 101;
        b.bookName = "Java Programming";
        b.author = "James Gosling";
        b.price = 499.99;
        b.display();

        Book1 b1 = new Book1();
        b1.setBookId(101);
        b1.setBookName("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPrice(499.99);
        System.out.println("Book ID   : " + b1.getBookId());
        System.out.println("Book Name : " + b1.getBookName());
        System.out.println("Author    : " + b1.getAuthor());
        System.out.println("Price     : " + b1.getPrice());
        Book1 b2 = new Book1(102, "Python Basics", "Guido van Rossum", 399.99);
        System.out.println("\nBook ID   : " + b2.getBookId());
        System.out.println("Book Name : " + b2.getBookName());
        System.out.println("Author    : " + b2.getAuthor());
        System.out.println("Price     : " + b2.getPrice());

        Student s = new Student("Rohan", 20, 101);
        Faculty f = new Faculty("Dr. Kumar", 45, "Computer Science");
        System.out.println("Student Details");
        s.displayStudent();
        System.out.println("Faculty Details");
        f.displayFaculty();

        Area area = new Area();
        System.out.println("Area of Circle    : " + area.circleArea(5.0));
        System.out.println("Area of Rectangle : " + area.rectangleArea(10, 8));
        System.out.println("Area of Triangle  : " + area.triangleArea(12.0, 6.0));
        Vehicle v;
        v = new Car();
        v.display();
        v = new Bike();
        v.display();

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
        Printable report = new Report();
        report.print();
    }
}