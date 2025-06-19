import java.util.*;
public class Question {

    
    // // first non-repeating letter in a string using a queue
    // public static void printNonRepeating(String string){
    //     int freq[] = new int[26];
    //     Queue<Character> q = new LinkedList<>();

    //     for(int i = 0; i < string.length(); i++){
    //         char ch = string.charAt(i);
    //         //add to queue
    //         q.add(ch);
    //         //increment frequency
    //         freq[ch - 'a']++;
            
    //         //remove from queue if frequency is greater than 1
    //         while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
    //             q.remove();
    //         }
            
    //         //print the first non-repeating character
    //         if(q.isEmpty()){
    //             System.out.print("-1 ");
    //         } else {
    //             System.out.print(q.peek() + " ");
    //         }
    //     }
    //     System.out.println();

    // }

    // public static void main(String[] args) {
    //     String str = "aabccxb";
    //     printNonRepeating(str);
        
    // }







    // //Interleave 2 Halves of a Queue(even length)
    // public static void interleave(Queue<Integer> q) {
        
    //     Queue<Integer> firstHalf = new LinkedList<>();
    //     int size = q.size();

    //     for (int i = 0; i < size / 2; i++) {
    //         firstHalf.add(q.remove());
    //     }
       
    //     while (!firstHalf.isEmpty()) {
    //         q.add(firstHalf.remove());
    //         q.add(q.remove());
    //     }
    // }

    // public static void main(String[] args) {
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(1);
    //     q.add(2);
    //     q.add(3);
    //     q.add(4);
    //     q.add(5);
    //     q.add(6);
    //     q.add(7);
    //     q.add(8);
    //     q.add(9);
    //     q.add(10);

    //     interleave(q);

    //     while (!q.isEmpty()) {
    //         System.out.print(q.remove() + " ");
    //     }
    // }







    // // Queue Reversal
    // public static void QueueReversal(Queue<Integer> q) {
    //     Stack<Integer> s = new Stack<>();
        
    //     // Step 1: Push all elements of the queue into the stack
    //     while (!q.isEmpty()) {
    //         s.push(q.remove());
    //     }
        
    //     // Step 2: Pop all elements from the stack and add them back to the queue
    //     while (!s.isEmpty()) {
    //         q.add(s.pop());
    //     }
    // }

    // public static void main(String[] args) {
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(1);
    //     q.add(2);
    //     q.add(3);
    //     q.add(4);
    //     q.add(5);

    //     System.out.println("Original Queue: " + q);
        
    //     QueueReversal(q);
        
    //     System.out.println("Reversed Queue: " + q);
    // }





}
