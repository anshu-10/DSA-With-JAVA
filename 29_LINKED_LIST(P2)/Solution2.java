// ===========================
// Solution 2: Skip M Nodes and Delete N Nodes in Linked List
// ===========================
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Solution2 {
    static class Node {
        int data;
        Node next;
    }

    // Function to push a node at the beginning of the list
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        return new_node;
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to skip M nodes and delete N nodes in the list
    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head;
        Node t;
        int count;

        // Traverse the list till end
        while (curr != null) {

            // Skip M nodes
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next;

            // If we reach end after skipping, return
            if (curr == null)
                return;

            // Start from next node and delete N nodes
            t = curr.next;
            for (count = 1; count <= N && t != null; count++) {
                t = t.next;
                // temp will be garbage collected
            }

            // Connect current node to the (N+1)th node
            curr.next = t;

            // Move current to next segment
            curr = t;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        // Create list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
    

        System.out.println("Original list:");
        printList(head);

        int M = 2, N = 3; // Skip 2 nodes, delete next 3 nodes
        skipMdeleteN(head, M, N);

        System.out.println("Modified list after skipping " + M + " and deleting " + N + " nodes:");
        printList(head);
    }

     


}
