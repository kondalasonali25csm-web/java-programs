package assignment;
class Men
{ // Method of parent class
    void work()
    {
        System.out.println("men works");
    }
}
// Child class extends Parent class
class Women extends Men { // Method of child class
    void dance()
    {
        System.out.println("women dances");
    }
}
public class Inh1 {
    public static void main(String args[])
    {
        Women d = new Women();
        d.work();
        d.dance();
    }
