import java.util.*;

// using classroom
public class QueueJCB {
    
    public static void main(String[] args) {
       //Queue q = new Queue();
       //Queue<Integer> q = new LinkedList<>(); // ArrayDeque<Integer> q = new ArrayDeque<>();

       Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
