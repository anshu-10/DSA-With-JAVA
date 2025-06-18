import java.util.*;


public class StackB {

    // // 2) push at bottom
    // public static void pushAtBottom(Stack<Integer> s, int data) {
    //     if (s.isEmpty()) {
    //         s.push(data);
    //         return;
    //     }
    //     int top = s.pop();
    //     pushAtBottom(s, data);
    //     s.push(top);
    // }

    // public static void main(String[] args) {
    //     //stack s new Stack();
    //     Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);

    //     pushAtBottom(s, 4);
    //     while (!s.isEmpty()) {
    //         System.out.println(s.peek());
    //         s.pop();
    //     }
    // }







    // // 3) reverse a string using stack 
    // public static String reverseString(String str) {

    //     Stack<Character> s = new Stack<>();
    //     int idx = 0;
    //     while (idx < str.length()) {
    //         s.push(str.charAt(idx));
    //         idx++;
    //     }

    //     StringBuilder reversed = new StringBuilder();
    //     while (!s.isEmpty()) {
    //         reversed.append(s.pop());
    //     }

    //     return reversed.toString();
    // }

    // public static void main(String[] args) {
    //     String str = "a,b,c";
    //     String reversedStr = reverseString(str);
    //     System.out.println("Original String: " + str);
    //     System.out.println("Reversed String: " + reversedStr);
    // }
    






    // // 4) reverse a stack using recursion
    // public static void pushAtBottom(Stack<Integer> s, int data) {
    //     if (s.isEmpty()) {
    //         s.push(data);
    //         return;
    //     }
    //     int top = s.pop();
    //     pushAtBottom(s, data);
    //     s.push(top);
    // }

    // public static void reverseStack(Stack<Integer> s) {
    //     if (s.isEmpty()) {
    //         return;
    //     }
    //     int top = s.pop();
    //     reverseStack(s);
    //     pushAtBottom(s, top);
    // }

    // public static void printStack(Stack<Integer> s) {
    //     while (!s.isEmpty()) {
    //         System.out.println(s.pop());
            
    //     }
    // }

    // public static void main(String[] args) {
    //     Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
        
    //     //3, 2, 1
    //     // Reversing the stack
    //     reverseStack(s);
    //     System.out.println("Reversed Stack:");
    //     printStack(s);
    //     // 1, 2, 3
    // }






    // // 5) Stock span problem
    // public static void stockSpan(int stocks[], int span[]) {
    //     Stack<Integer> s = new Stack<>();
    //     span[0] = 1;
    //     s.push(0);

    //     for (int i = 1; i < stocks.length; i++) {
    //         int currPrice = stocks[i];
    //         while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
    //             s.pop();
    //         }
    //         if (s.isEmpty()) {
    //             span[i] = i + 1; // all previous days are less than current
    //         } else {
    //             int prevHigh = s.peek();
    //             span[i] = i - prevHigh; // current index - previous higher index}
    //         }
            
    //         s.push(i); // push current index onto the stack
        
    //     }
    // }

    // public static void main (String[] args) {
    //     int stocks[] = {100, 80, 60, 70, 60, 85, 100};
    //     int span[] = new int[stocks.length];
    //     stockSpan(stocks, span);

    //     for (int i = 0; i < span.length; i++) {
    //        System .out.print(span[i] + " ");
    //     }
        
    // }







    // 6) Next greater element to the right

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] nextGreater = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Remove elements smaller than or equal to current
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // If stack is empty, no greater element
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // Push current index to stack
            s.push(i);
        }

        // Print the next greater elements
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }




    // 7) Next greater element to the left
    // 8) Next smaller element to the right
    // 9) Next smaller element to the left

}








