public class CircularLL {           // **Not so important**: This is a simple implementation of a circular linked list in Java.


    // Node class representing each element in the circular linked list
    static class Node {
        int data;
        Node next;
    }

    // Add to empty list (first node)
    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;

        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        last.next = last; // circular link
        return last;
    }

    // Add node at the front (beginning)
    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    // Add node at the end
    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode; // update last
        return last;
    }

    // Add node after a specific node (given item)
    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;

        Node p = last.next;
        do {
            if (p.data == item) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;

                if (p == last)
                    last = newNode;

                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " is not present in the list.");
        return last;
    }

    // Delete a node by key
    static Node deleteNode(Node last, int key) {
        if (last == null)
            return null;

        // Case: Only one node in list
        if (last.data == key && last.next == last) {
            last = null;
            return last;
        }

        Node temp = last;

        // Case: Node to be deleted is the last node
        if (last.data == key) {
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
            return last;
        }

        // Case: Node is somewhere in the middle
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

        // Key found
        if (temp.next.data == key) {
            temp.next = temp.next.next;
        }

        return last;
    }

    // Traverse and print the circular linked list
    static void traverse(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node p = last.next;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
        System.out.println();
    }

    // Main method to test circular linked list
    public static void main(String[] args) {
        Node last = null;

        // Create the list: 6
        last = addToEmpty(last, 6);

        // Add 8 at end → 6 -> 8
        last = addEnd(last, 8);

        // Add 2 at front → 2 -> 6 -> 8
        last = addFront(last, 2);

        // Add 10 after 2 → 2 -> 10 -> 6 -> 8
        last = addAfter(last, 10, 2);

        // Print list
        System.out.print("Current List: ");
        traverse(last); // Output: 2 10 6 8

        // Delete 8 from list
        last = deleteNode(last, 8);

        // Print list after deletion
        System.out.print("After deleting 8: ");
        traverse(last); // Output: 2 10 6
    }
    
}
