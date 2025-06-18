public class LinkedList {

    // Node class representing each element in the list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Static pointers to track head and tail of the list
    public static Node head;
    public static Node tail;
    public static int size;

    // Method to add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data); // Step 1: create new node
        size++;                        // Increase size

        if (head == null) {
            head = tail = newNode;     // If list is empty
            return;
        }

        newNode.next = head; // Step 2: link newNode to head
        head = newNode;      // Step 3: update head
    }

    // Method to add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data); // Step 1: create new node
        size++;                        // Increase size

        if (head == null) {
            head = tail = newNode;     // If list is empty
            return;
        }

        tail.next = newNode; // Step 2: link current tail to new node
        tail = newNode;      // Step 3: update tail
    }

    // Method to print the entire linked list
    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }







    // 1) Slow-Fast Pointer approach to detect cycle
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





    // 2) remove cycle from linked list
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break; // Cycle detected
            }
        }

        // If no cycle, return
        if (fast == null || fast.next == null) {
            return;
        }

        // Move slow to head and find the start of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Find the last node in the cycle and break it
        Node cycleStart = slow;
        while (fast.next != cycleStart) {
            fast = fast.next;
        }
        fast.next = null; // Break the cycle
    }


    // public static void main(String args[]) {

    //     head = new Node(1);
    //     head.next = new Node(2);
    //     head.next.next = new Node(3);
    //     head.next.next.next = head; // Creating a cycle
    //     //1-> 2 -> 3 -> 1 (cycle)
        
    //     System.out.println("Is cycle present: " + isCycle());
    //     removeCycle();
    //     System.out.println("Is cycle present after removal: " + isCycle());

    // }





    // // 3) Merge Sort for Linked List
    // private Node getMid(Node head) {
    //     Node slow = head;
    //     Node fast = head.next;

    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;// Mid node
    // }

    // private Node merge(Node head1, Node head2){
    //    Node mergedLL = new Node(-1);
    //    Node temp = mergedLL;

    //    while(head1 != null && head2 != null) {
    //        if (head1.data < head2.data) {
    //            temp.next = head1;
    //            head1 = head1.next;
    //        } else {
    //            temp.next = head2;
    //            head2 = head2.next;
    //        }
    //        temp = temp.next;
    //    }

    //      while (head1 != null) {
    //           temp.next = head1;
    //           head1 = head1.next;
    //           temp = temp.next;
    //      }

    //         while (head2 != null) {
    //             temp.next = head2;
    //             head2 = head2.next;
    //             temp = temp.next;
    //         }

    //      return mergedLL.next; // Return the merged linked list
    // }

    // public Node mergeSort(Node head) {
    //     // Base case
    //     if (head == null || head.next == null) {
    //         return head;
    //     }

    //     // Get the mid node
    //     Node mid = getMid(head);

    //     //left and right MS
    //     Node rightHead = mid.next;
    //     mid.next = null; // Split the list into two halves
    //     Node newLeft = mergeSort(head);
    //     Node newRight = mergeSort(rightHead);

    //     // Merge the sorted halves
    //     return merge(newLeft, newRight);
    // }   



    // public static void main(String args[]) {

    //     LinkedList ll = new LinkedList();
    //     ll.addFirst(1);
    //     ll.addFirst(3);  
    //     ll.addFirst(2);
    //     ll.addFirst(4);
    //     ll.addFirst(5);

    //     ll.print();
    //     ll.head = ll.mergeSort(ll.head); 
    //     ll.print();
    // }






    // //  4)  Zig-Zag Merge Sort for Linked List
    // public void zigZag(){
    //     //find mid
    //     Node slow = head;
    //     Node fast = head.next;
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     Node mid = slow;


    //     //reverse second half
    //     Node curr = mid.next;
    //     mid.next = null; // Split the list into two halves
    //     Node prev = null;
    //     Node next;

    //     while (curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }   

    //     Node left = head;
    //     Node right = prev; // This is the head of the reversed second half
    //     Node nextLeft, nextRight;


    //     //alt merge - Zig-Zag merge
    //     while(left != null && right != null) {
    //         nextLeft = left.next; // Store next left node
    //         nextRight = right.next; // Store next right node

    //         left.next = right; // Link left to right
    //         right.next = nextLeft; // Link right to next left

    //         left = nextLeft; // Move to the next left node
    //         right = nextRight; // Move to the next right node

    //     }
    // }

    // public static void main(String args[]) {
    //     LinkedList ll = new LinkedList();
    //     ll.addFirst(1);
    //     ll.addFirst(3);  
    //     ll.addFirst(2);
    //     ll.addFirst(4);
    //     ll.addFirst(5);
    //     //1-> 2 -> 4 -> 3 -> 5
    //     ll.print();
    //     ll.zigZag();
    //     ll.print();

    //     //5-> 2 -> 4 -> 1 -> 3
    // }







}