 
// ===========================
// Solution 1: Intersection Point in Linked Lists (Brute Force)
// ===========================
// Time Complexity: O(m * n)
// Space Complexity: O(1)

public class Solution1 {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to find the intersection point of two linked lists
    public Node getIntersectionNode(Node head1, Node head2) {
        // Traverse the second list
        while (head2 != null) {
            Node temp = head1;
            // For each node in list2, compare with all nodes in list1
            while (temp != null) {
                if (temp == head2) {
                    // Return the intersection node
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null; // No intersection found
    }

    public static void main(String[] args) {
        Solution1 list = new Solution1();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        // Creating second list: 3 -> 6 -> 9
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;

        // Creating common intersection part: 15 -> 30
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;

        Node intersectionPoint = list.getIntersectionNode(head1, head2);
        if (intersectionPoint == null) {
            System.out.println("No Intersection Point");
        } else {
            System.out.println("Intersection Point: " + intersectionPoint.data);
        }
    }
}
