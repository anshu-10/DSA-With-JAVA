public class Recursion1P22 {

    // public static void printdec(int n){
    //     if(n ==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printdec(n-1);
    // }


    // public static void main(String args[]){
    //   int n = 10;  
    //   printdec(n);
    // }    






    // public static void printinc(int n){
    //     if(n ==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     printinc(n-1);
    //     System.out.print(n+" ");
        
    // }


    // public static void main(String args[]){
    //   int n = 10;  
    //   printinc(n);
    // } 
    






    // public static int sum(int n) {
    //     if (n == 1) {
    //         return 1;
    //     }
    //     int fnm1 = sum(n - 1);
    //     int fn = n + fnm1;
    //     return fn;
    // }

    // public static void main(String args[]) {
    //     int n = 5;
    //     System.out.println(sum(n));
    // }
    




    // public static int sum(int n) {
    //     if (n == 1) {
    //         return 1;
    //     }
    //     int fnm1 = sum(n - 1);
    //     int fn = n + fnm1;
    //     return fn;
    // }

    // public static void main(String args[]) {
    //     int n = 5;
    //     System.out.println(sum(n));
    // }






    // public static int fib(int n) {
    //     if (n == 0  ||  n == 1) {
    //         return n;
    //     }
    //     int fnm1 = fib(n - 1);
    //     int fnm2 = fib(n - 2);
    //     int fn = fnm1 + fnm2;
    //     return fn;
    // }

    // public static void main(String args[]) {
    //     int n = 25;
    //     System.out.println(fib(n));
    //     System.out.println(fib(26));
    //     System.out.println(fib(27));
    //     System.out.println(fib(28));
    //     System.out.println(fib(29));
    //     System.out.println(fib(30));   
    // }





    // public static boolean issorted(int arr[], int i){
    //     if(i == arr.length-1){
    //         return true;

    //     }
    //     if(arr[i] > arr[ i + 1 ]){
    //         return false;
    //     }
    //     return issorted(arr, i+1);

    // }
    // public static void main(String args[]) {
    //     int arr[] = {1, 2, 3, 4, 5};
    //     System.out.println( issorted(arr, 0));
    // }





    // public static int firstoccurence(int arr[], int key, int i){
    //     if(i == arr.length){
    //         return -1;

    //     }
    //     if(arr[i] == key){
    //         return i;
    //     }
    //     return firstoccurence(arr, key, i+1);

    // }
    // public static void main(String args[]) {
    //     int arr[] = {1, 2, 5, 4, 5};
    //     System.out.println(firstoccurence(arr, 5,  0));
    // }






    // public static int lastoccurence(int arr[], int key, int i){
    //     if(i == arr.length){
    //         return -1;

    //     }
        
    //     int isfound = lastoccurence(arr, key, i+1);
    //     if(isfound == -1 && arr[i] == key){
    //         return i;
    //     }

    //     return isfound;

    // }
    // public static void main(String args[]) {
    //     int arr[] = {1, 2, 5, 4, 5};
    //     System.out.println( lastoccurence(arr, 5,  0));
    // }





    // public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;

    //     }
        
    //     // int xnm1 = power(x, n-1);
    //     // int xn = x* xnm1;
    //     // return xn;
    //     return x* power(x, n-1);

    // }
    // public static void main(String args[]) {
    //     System.out.println( power( 5,  2));
    // }







    //2nd optimize solu

    public static int power(int a, int n){
        if(n == 0){
            return 1;

        }
        int halfpowersq = power(a, n/2)* power(a, n/2);

        //n is odd
        if(n % 2 != 0){
            halfpowersq = a * halfpowersq;
        }

        return halfpowersq;

    }
    public static void main(String args[]) {
        System.out.println( power( 5,  2));
    }






}
