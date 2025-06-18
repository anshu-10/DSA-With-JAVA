// ===========================
// Solution 5: Merge K Sorted Linked Lists
// ===========================
// Time Complexity: O(n * log k)
// Space Complexity: O(n)

public class Solution5 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    // Merge two sorted linked lists
    public static Node SortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = SortedMerge(a.next, b);
        } else {
            result = b;
            result.next = SortedMerge(a, b.next);
        }
        return result;
    }

    // Merge K sorted linked lists using divide and conquer
    public static Node mergeKLists(Node arr[], int last) {
        while (last != 0) {
            int i = 0, j = last;

            while (i < j) {
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if (i >= j) last = j;
            }
        }
        return arr[0];
    }

    // Print the merged linked list
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int k = 3; // Number of linked lists
        Node arr[] = new Node[k];

        // List 1: 1->3->5->7
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        // List 2: 2->4->6->8
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        // List 3: 0->9->10->11
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = mergeKLists(arr, k - 1);
        printList(head);
    }
}

