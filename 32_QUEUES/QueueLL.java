public class QueueLL {

    //Queue using Linked List
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    

    static class Queue{
        static Node head = null;
        static Node tail = null;
        

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        //remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
           
            int front = head.data;
            //single element
            if (head == tail) {
                head = null;
                tail = null; // Reset both pointers
            } else {
                head = head.next; // Move head to the next node
            }
            return front;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue( );
        q.add(10);
        q.add(20);
        q.add(30);
        
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
