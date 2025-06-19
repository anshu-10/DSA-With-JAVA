import java.util.*;


// NOTES:   Enqueue: Add an element to the end of the queue
//          Dequeue: Remove an element from the front of the queue
//          Deque (Double-ended queue): A queue that allows insertion and deletion from both ends



public class DequeI {




    // //Deque Implementation
    // public static void main(String[] args) {
    //   Deque<Integer> deque = new ArrayDeque<>();
    //     // Adding elements to the deque
    //     deque.addFirst(10);  // Add to front
    //     deque.addLast(20);   // Add to back
    //     deque.addFirst(5);   // Add to front
    //     deque.addLast(30);   // Add to back

    //     System.out.println("Deque after additions: " + deque);

    //     // Removing elements from the deque
    //     int firstElement = deque.removeFirst();  // Remove from front
    //     int lastElement = deque.removeLast();    // Remove from back

    //     System.out.println("Removed first element: " + firstElement);
    //     System.out.println("Removed last element: " + lastElement);
        
    //     System.out.println("Deque after removals: " + deque);

    // }
    





  // //Stack using Deque
  // static class Stack{
  //   Deque<Integer> deque = new LinkedList<>();

  //   public void push(int Data) {
  //       deque.addLast(Data); // Add to the back of the deque
  //   }

  //   public int pop(){
  //     return deque.removeLast(); // Remove from the back of the deque
  //   }

  //   public int peek() {
  //       return deque.getLast(); // Get the last element without removing it
  //   } 

  // }

  // public static void main(String[] args) {
  //   Stack stack = new Stack();
  //   stack.push(10);
  //   stack.push(20);
  //   stack.push(30);

  //   System.out.println("Top element: " + stack.peek()); // Should print 30

  //   System.out.println("Popped element: " + stack.pop()); // Should remove and print 30
  //   System.out.println("Popped element: " + stack.pop()); // Should remove and print 20
  //   System.out.println("Popped element: " + stack.pop()); // Should remove and print 10
  // }
    





  // //Queue using Deque
  static class Queue {
    Deque<Integer> deque = new LinkedList<>();

    public void enqueue(int data) {
        deque.addLast(data); // Add to the back of the deque
    }

    public int dequeue() {
        return deque.removeFirst(); // Remove from the front of the deque
    }

    public int peek() {
        return deque.getFirst(); // Get the first element without removing it
    }

    public boolean isEmpty() {
        return deque.isEmpty(); // Check if the queue is empty
    }
  }

  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    System.out.println("Front element: " + queue.peek()); // Should print 10

    System.out.println("Dequeued element: " + queue.dequeue()); // Should remove and print 10
    System.out.println("Dequeued element: " + queue.dequeue()); // Should remove and print 20
    System.out.println("Dequeued element: " + queue.dequeue()); // Should remove and print 30

    System.out.println("Is the queue empty? " + queue.isEmpty()); // Should print true
  }



}
