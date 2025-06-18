public class CirQueue {

    //Circular Queue using Arrays
    // This implementation uses a fixed-size array to represent the queue.
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
            
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }



        //add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            //add first element
            if (front == -1) {
                front = 0; // Initialize front if it's the first element
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
           
            int result = arr[front];

            //last element
            if (rear == front) {
                rear = -1;
                front = -1; // Reset both pointers
            } else {
                front = (front + 1) % size; // Move front to the next position
            }   
            return result;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.remove()); // Should print true
        q.add(40); // Should print "Queue is full"
        System.out.println(q.remove());
        q.add(50);
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
