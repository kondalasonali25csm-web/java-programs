import java.util.*;
class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> b = new ArrayDeque<>();
        b.addFirst(10);
        b.addLast(20);
        b.offerFirst(5);
        b.offerLast(25);
        System.out.println("Deque: " + b);
        System.out.println("First: " + b.peekFirst());
        System.out.println("Last: " + b.peekLast());
        System.out.println("Remove First: " + b.removeFirst());
        System.out.println("Remove Last: " + b.removeLast());
        System.out.println("Poll First: " + b.pollFirst());
        System.out.println("Poll Last: " + b.pollLast());
        System.out.println("Final Deque: " + b);
    }
}
