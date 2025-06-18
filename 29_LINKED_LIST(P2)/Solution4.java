// ===========================
// Solution 4: Segregate Even and Odd Nodes
// ===========================
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Solution4 {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to reorder list so all even nodes come before odd ones
    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        // Get the last node
        while (end.next != null)
            end = end.next;

        Node new_end = end;

        // Move initial odd nodes to the end
        while (curr != null && curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        // Now current points to first even node
        if (curr != null && curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else prev = curr;

        // Check and move the end node if it is odd
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    // Push a new node to the beginning
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Solution4 llist = new Solution4();
        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(6);
        llist.push(4);
        llist.push(2);
        llist.push(0);

        System.out.println("Linked List");
        llist.printList();

        llist.segregateEvenOdd();

        System.out.println("Updated Linked List");
        llist.printList();
    }
}

