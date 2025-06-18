import java.util.LinkedList;       // java collection framework


public class Classroom {
    public static void main(String args[]){
        // Create a LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        //adding elements to the LinkedList
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //0-> 1 -> 2
        // Print the LinkedList 
        System.out.println("LinkedList: " + ll);
    }
}
