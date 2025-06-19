import java.util.*;

public class StackQ {

    //Using two Ques to implement a stack
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        //add
        public static void push(int data) {
            if(!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            
            int top = -1;

            //case 1: q1 is not empty
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove(); // Keep track of the last element
                    if (q1.isEmpty()) {
                        break; // If q1 is empty, return the last element
                    }
                    q2.add(top); // Move elements to q2
                }

            }else{//case 2: q2 is not empty
                while(!q2.isEmpty()) {
                    top = q2.remove(); // Keep track of the last element
                    if (q2.isEmpty()) {
                        break; // If q2 is empty, return the last element
                    }
                    q1.add(top); // Move elements to q1
                }
            }
            return top; // Return the last element which is the top of the stack
        }

        public static int peek(){
             if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            
            int top = -1;

            //case 1: q1 is not empty
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove(); // Keep track of the last element
                    q2.add(top); // Move elements to q2
                }

            }else{//case 2: q2 is not empty
                while(!q2.isEmpty()) {
                    top = q2.remove(); // Keep track of the last element
                    q1.add(top); // Move elements to q1
                }
            }
            return top; // Return the last element which is the top of the stack
        
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    
}
