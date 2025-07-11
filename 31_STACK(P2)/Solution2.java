// ============================================
// Solution 2: Simplify Unix-style Path
// Time Complexity: O(n)
// Space Complexity: O(1)
// ============================================

import java.io.*;
import java.util.*;

class Solution2 {
    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/");
        String res = simplify(str);
        System.out.println(res);
    }

    static String simplify(String A) {
        Stack<String> st = new Stack<>();
        String res = "/";
        int len_A = A.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";

            while (i < len_A && A.charAt(i) == '/')
                i++;

            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            if (dir.equals("..")) {
                if (!st.empty())
                    st.pop();
            } else if (dir.equals(".")) {
                continue;
            } else if (dir.length() != 0) {
                st.push(dir);
            }
        }

        Stack<String> st1 = new Stack<>();
        while (!st.empty()) {
            st1.push(st.pop());
        }

        while (!st1.empty()) {
            if (st1.size() != 1)
                res += (st1.pop() + "/");
            else
                res += st1.pop();
        }

        return res;
    }
}
