// Question 4 : Reversing the first K elements of a Queue
// We have an integer k and a queue of integers, we need to reverse the order of the first 
// k elements of the queue, leaving the other elements in the same relative order.
// Sample Input 1: Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100], k = 5
// Sample Output 1: Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]

import java.util.*;

public class Solution4 {

    static Queue<Integer> reverseKElements(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        int k = 5;

        Queue<Integer> updatedQueue = reverseKElements(q, k);
        System.out.println(updatedQueue);
    }
}

