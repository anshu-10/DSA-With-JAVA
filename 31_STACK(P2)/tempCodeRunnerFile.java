// 1)  Valid parentheses
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


