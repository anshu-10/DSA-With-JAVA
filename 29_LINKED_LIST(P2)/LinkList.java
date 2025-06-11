public class LinkList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Slow-Fast Pointer approach to detect cycle
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Creating a cycle
        //1-> 2 -> 3 -> 1 (cycle)
        
        System.out.println("Is cycle present: " + isCycle());
    }
}
