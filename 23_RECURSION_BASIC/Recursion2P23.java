public class Recursion2P23 {

    // public static int tilingprob(int n){ // 2 X n (tiling size)
    //     //base case
    //     if(n == 0 || n == 1){
    //         return 1;
    //     }
    //     //vertical choice
    //     int fnm1 = tilingprob(n - 1);

    //     //horizontal choice
    //     int fnm2 = tilingprob(n - 2);

    //     int totalways = fnm1 + fnm2;
    //     return totalways;

    // }

    // public static void main(String args[]){
    //     System.out.println(tilingprob(2));

    // }




    



    // public static void removeduplicate(String str, int idx, StringBuilder newstr, boolean map[]){

    //     if(idx == str.length() ){
    //         System.out.println(newstr);
    //         return;
    //     }

    //     //kaam
    //     char  curchar = str.charAt(idx);
    //     if(map[curchar- 'a'] == true) {
    //         //duplicate
    //         removeduplicate(str, idx+1, newstr, map );

    //     }else{
    //         map[curchar-'a'] = true;
    //         removeduplicate(str, idx+1, newstr.append(curchar), map );
    //     }
    // }
    // public static void main(String args[]){
    //    String str = "apnacollege";
    //    removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);   
    // }







    // public static int friendspair(int n) {
    //     if (n == 1 || n == 2) {
    //         return n;
    //     }

    //     // // single
    //     // int fnm1 = friendspair(n - 1);

    //     // // pair
    //     // int fnm2 = friendspair(n - 2);
    //     // int pairways = (n - 1) * fnm2;

    //     // int totalways = fnm1 + pairways;
    //     // return totalways;

    //     return friendspair(n-1) + (n-1) * friendspair(n-2);
    // }

    // public static void main(String[] args) {
    //     int result = friendspair(3);
    //     System.out.println(result);  // Output should be 4
    // }





    // public static void printbinstring(int n, int lastplace, String str){
    //     //base case
    //     if(n == 0){
    //         System.out.println(str);
    //         return;
    //     }

    //     //kaam
    //     printbinstring(n - 1, 0, str+"0");

    //     if (lastplace == 0){
    //         printbinstring(n - 1, 1, str+"1");
    //     }
    // }

    // public static void main(String args[]){
    //     printbinstring(3, 0, "");
    // }





    /*               Practise  Question                   */


    //Q1

    // public static void alloccurance(int arr[], int key, int i){
    //     if(i == arr.length){
    //         return;
    //     }

    //     if(arr[i] == key){
    //         System.out.print(i+" ");
    //     }

    //     alloccurance(arr, key, i+1);
    // }


    // public static void main(String args[]){
    //     int arr[] = {1, 2, 3, 2, 4, 5, 2, 2, 6, 2};
    //     int key = 2;
    //     alloccurance(arr, key, 0);
    //     System.out.println();

    // }
   



    //Q2

    // static final String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    // public static void printDigits(int number) {
    //     if (number == 0) {
    //         return;
    //     }
    //     int lastDigit = number % 10;
    //     printDigits(number / 10);
    //     System.out.print(digits[lastDigit] + " ");
    // }

    // public static void main(String[] args) {
    //     printDigits(1234);
    // }
   




    //Q3

    // public static int length(String str) {
    //     if (str.length() == 0) {
    //         return 0;
    //     }
    //     return length(str.substring(1)) + 1;
    // }

    // public static void main(String[] args) {
    //     String str = "abcde";
    //     System.out.println(length(str));
    // }





    //Q4

    // public static int countSubstrs(String str, int i, int j, int n) {
    //     // Base cases
    //     if (n == 1) {
    //         return 1;
    //     }
    //     if (n <= 0) {
    //         return 0;
    //     }

    //     // Recursive calls
    //     int res = countSubstrs(str, i + 1, j, n - 1) + 
    //     countSubstrs(str, i, j - 1, n - 1) -
    //     countSubstrs(str, i + 1, j - 1, n - 2);

    //     // If characters at i and j are same
    //     if (str.charAt(i) == str.charAt(j)) {
    //         res++;
    //     }

    //     return res;
    // }

    // public static void main(String[] args) {
    //     String str = "abcab";
    //     int n = str.length();
    //     int result = countSubstrs(str, 0, n - 1, n);
    //     System.out.println("Total substrings: " + result);
    // }

    


    //Q5

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Transfer top n-1 disks from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);

        // Transfer nth disk from src to dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Transfer n-1 disks from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }



    //    https://www.youtube.com/watch?v=u-HgzgYe8KA
    
}
