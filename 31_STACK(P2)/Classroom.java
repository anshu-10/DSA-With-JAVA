import java.util.*;

public class Classroom {
    
    // // 1)  Valid parentheses
    // public static boolean isValid(String str) {
    //     Stack<Character> s = new Stack<>();

    //     for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);

    //         // Opening brackets
    //         if (ch == '(' || ch == '{' || ch == '[') {
    //             s.push(ch); 
    //         } else {
    //             // Closing brackets
    //             if (s.isEmpty()) {
    //                 return false; 
    //             }
    //             if ((s.peek() == '(' && ch == ')') || 
    //                 (s.peek() == '{' && ch == '}') || 
    //                 (s.peek() == '[' && ch == ']')) {
    //                 s.pop(); 
    //             } else {
    //                 return false; 
    //             }
    //         }
    //     }

    //     return s.isEmpty(); // Return true only if stack is empty
    // }

    // public static void main(String[] args) {
    //     // Test cases
    //     System.out.println(isValid("(){}[]"));    // true
    //     System.out.println(isValid("([{}])"));    // true
    //     System.out.println(isValid("(]"));        // false
    //     System.out.println(isValid("([)]"));      // false
    // }






    // // 2) Function to check for duplicate parentheses
    // public static boolean isValid(String str) {
    //     Stack<Character> s = new Stack<>();

    //     for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);

    //         if (ch != ')') {
    //             s.push(ch);
    //         } else {
    //             int count = 0;

    //             // Pop until matching '(' is found
    //             while (!s.isEmpty() && s.peek() != '(') {
    //                 s.pop();
    //                 count++;
    //             }

    //             // If no character between '(', ')' → it's a duplicate
    //             if (count < 1) {
    //                 return true;
    //             }

    //             if (!s.isEmpty()) {
    //                 s.pop(); // Pop the opening '('
    //             }
    //         }
    //     }

    //     return false; // No duplicate parentheses found
    // }

    // public static void main(String[] args) {
    //     // Test cases
    //     System.out.println(isValid("(a + b)"));           // false
    //     System.out.println(isValid("((a + b))"));         // true
    //     System.out.println(isValid("(a + (b + c))"));     // false
    //     System.out.println(isValid("((a + b) + c)"));     // false
    //     System.out.println(isValid("(a + b) + ((c))"));   // true
    // }








    // 3) Function to calculate the maximum area
    public static int getMaxArea(int[] heights) {
        int n = heights.length;

        int[] nsr = nextSmallerRight(heights, n);
        int[] nsl = nextSmallerLeft(heights, n);

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // Next Smaller to Right
    public static int[] nextSmallerRight(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] nsr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = n; // No smaller element to right
            } else {
                nsr[i] = s.peek(); // Index of smaller element
            }

            s.push(i);
        }

        return nsr;
    }

    // Next Smaller to Left
    public static int[] nextSmallerLeft(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] nsl = new int[n];

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1; // No smaller element to left
            } else {
                nsl[i] = s.peek(); // Index of smaller element
            }

            s.push(i);
        }

        return nsl;
    }

    public static void main(String[] args) {
        int[] histogram = {2, 1, 5, 6, 2, 3};

        int maxArea = getMaxArea(histogram);
        System.out.println("Maximum Area = " + maxArea); // Output: 10
    }


}
