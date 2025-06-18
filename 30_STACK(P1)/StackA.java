import java.util.ArrayList;


public class StackA{


    // // 1) Stack implementation using ArrayList
    // static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     //push operation
    //     public static void push(int data) {
    //         list.add(data);
    //     }

    //     //pop operation
    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1; // or throw an exception
    //         }
    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }

    //     //peek operation
    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1; // or throw an exception
    //         }
    //         return list.get(list.size() - 1);
    //     }
    // }
    // public static void main(String[] args) {
    //     Stack s = new Stack();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
        
    //     while(!s.isEmpty()) {
    //         System.out.println(s.peek());
    //         s.pop();
    //     }
    // }




    // 2) Stack implementation using LinkedList
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        //push operation
        public static void push(int data) {
            Node newNode = new Node(data);
           
            if(isEmpty()) {
                head = newNode;
                return;
            } 
            newNode.next = head;
            head = newNode;
        }

        //pop operation
        public static int pop() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek operation
        public static int peek() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }






    



}