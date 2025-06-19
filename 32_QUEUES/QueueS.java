import java.util.*;
public class QueueS {

    // Using two stacks to implement a queue
    // This is a common interview question and can be solved in O(1) amortized time for add and O(1) for remove and peek.
    static class stack{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>(); 


        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add
        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }


    public static void main(String[] args) {
        stack q = new stack();
        q.add(10);
        q.add(20);
        q.add(30);
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

    
}
