package Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // LinkedList special methods
        queue.addFirst("Zara");    // add to front
        queue.addLast("Diana");    // add to end
        System.out.println("List      : " + queue);

        System.out.println("First     : " + queue.getFirst()); // Zara
        System.out.println("Last      : " + queue.getLast());  // Diana

        queue.removeFirst(); // remove from front
        queue.removeLast();  // remove from end
        System.out.println("After rem : " + queue);

        // Use as Queue (FIFO — First In First Out)
        // Real world: customer support ticket queue
        LinkedList<String> ticketQueue = new LinkedList<>();
        ticketQueue.offer("Ticket-001"); // add to queue
        ticketQueue.offer("Ticket-002");
        ticketQueue.offer("Ticket-003");

        System.out.println("\n-- Processing Tickets --");
        while (!ticketQueue.isEmpty()) {
            System.out.println("Processing: " + ticketQueue.poll()); // removes from front
        }
    }
}
