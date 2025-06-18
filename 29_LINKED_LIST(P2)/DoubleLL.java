public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;    
    public static int size;




    // 1) addFirst method
    public void addFirst(int data) {
        Node newNode = new Node(data); // Step 1: create new node
        size++;                        // Increase size

        if (head == null) {
            head = tail = newNode;     // If list is empty
            return;
        }

        newNode.next = head; // Step 2: link newNode to head
        head.prev = newNode;  // Link head's previous to newNode
        head = newNode;       // Step 3: update head
    }

    //print method
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }




    // 2) removeFirst method
    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1) { // If only one element
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data; // Store value to return
        head = head.next;   // Move head to next node
        head.prev = null;   // Update new head's previous to null
        size--;             // Decrease size  
        return val;         // Return removed value  
        
      
    }




    // 3) addLast method
    public void addLast(int data) {
        Node newNode = new Node(data); // Step 1: create new node
        size++;                        // Increase size

        if (head == null) {
            head = tail = newNode;     // If list is empty
            return;
        }

        tail.next = newNode; // Step 2: link current tail to new node
        newNode.prev = tail;  // Link new node's previous to current tail
        tail = newNode;       // Step 3: update tail
    }

    // Print method
    public void printReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }



    // 4) removeLast method
    public int removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1) { // If only one element
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        
        int val = tail.data; // Store value to return
        tail = tail.prev;   // Move tail to previous node
        tail.next = null;   // Update new tail's next to null
        size--;             // Decrease size  
        return val;         // Return removed value  
    }




    // 5) reverse a doubly linked list
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next; // Store next node
            curr.next = prev; // Reverse the next pointer
            curr.prev = next; // Reverse the previous pointer

            prev = curr;      // Move temp to current node
            curr = next;     // Move to next node
        }
        head = prev; // Update head to the last processed node
    }




  public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        list.print(); // 20 <-> 10 <-> 30 <-> 40 <-> null

        System.out.println("Removed first: " + list.removeFirst()); // 20
        list.print(); // 10 <-> 30 <-> 40 <-> null

        System.out.println("Removed last: " + list.removeLast()); // 40
        list.print(); // 10 <-> 30 <-> null

        System.out.println("Reversing the list:");
        list.printReverse(); // 30 <-> 10 <-> null

        
    }
    
}
