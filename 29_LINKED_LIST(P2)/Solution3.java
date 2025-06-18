// ===========================
// Solution 3: Swap Two Nodes Without Swapping Data
// ===========================
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Solution3 {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to swap nodes by changing links (not data)
    public void swapNodes(int x, int y) {
        if (x == y) return; // No need to swap same elements

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present
        if (currX == null || currY == null) return;

        // If x is not head
        if (prevX != null) prevX.next = currY;
        else head = currY;

        // If y is not head
        if (prevY != null) prevY.next = currX;
        else head = currX;

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // Function to push element at the beginning
    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    // Function to print the linked list
    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution3 llist = new Solution3();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("\nLinked list before swapping: ");
        llist.printList();

        llist.swapNodes(4, 3);

        System.out.print("\nLinked list after swapping: ");
        llist.printList();
    }
}