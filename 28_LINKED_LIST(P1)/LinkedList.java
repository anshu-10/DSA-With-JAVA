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



    // Method to add a node at a specific index
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        size++;                       // Increase size
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {         // Traverse to (idx - 1)
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;     // Step 1: link new node to next
        temp.next = newNode;          // Step 2: link previous to new node
    }



    // Method to remove the first node
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;  // If only one node
            size = 0;
            return val;
        }

        int val = head.data;     // Store data to return
        head = head.next;        // Move head to next
        size--;                  // Decrease size
        return val;
    }



    // Method to remove the last node
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null; // Only one node
            size = 0;
            return val;
        }

        // Traverse to second last node
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // Tail node data
        prev.next = null;         // Remove last node
        tail = prev;              // Update tail
        size--;                   // Decrease size
        return val;
    }

    

    // Iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i; // key found
            }
            temp = temp.next;
            i++;
        }
        return -1; // key not found
    }



    // Recursive search helper
    public int helper(Node head, int key) {
        if (head == null) return -1;
        if (head.data == key) return 0;

        int idx = helper(head.next, key);
        if (idx == -1) return -1;
        return idx + 1;
    }

    // Wrapper for recursive search
    public int recSearch(int key) {
        return helper(head, key);
    }



    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }



    // Delete nth node from end
    public void deleteNthFromEnd(int n) {
        // Calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // remove first
            return;
        }

        //sz-1
        int i = 1;
        int iToFind = sz-1;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;

            prev.next = prev.next.next;
            return;
        }
    }

         


    // palindrome  ABBA both side same
    // SLOW - Fast approach

    public Node FindMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; // +2
        }
        return slow; // Mid node
    }

    // Check if linked list is palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) return true; 
        // 1) Empty or single node

        Node mid = FindMid(head);
        Node prev = null;
        Node curr = mid;

        // 2) Reverse second half
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3) Compare first half and reversed second half
        Node left = head;
        Node right = prev; // Start of reversed second half

        while (right != null) {
            if (left.data != right.data) return false; // Not a palindrome
            left = left.next;
            right = right.next;
        }
        return true; // Is a palindrome
    }




    // Main method for testing
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3); // list becomes: 1 -> 2 -> 3 -> 4 -> 5

        ll.print();

        System.out.println("Iterative Search 3: " + ll.itrSearch(3)); // Output: 2
        System.out.println("Iterative Search 10: " + ll.itrSearch(10)); // Output: -1

        System.out.println("Recursive Search 4: " + ll.recSearch(4)); // Output: 3

        ll.reverse();
        ll.print(); // 5 -> 4 -> 3 -> 2 -> 1

        ll.deleteNthFromEnd(2); // Deletes 2nd node from end
        ll.print(); // 5 -> 4 -> 3 -> 1

        System.out.println("Is Palindrome: " + ll.isPalindrome()); // Output: false
    }

}
