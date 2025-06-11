public class BitManipulation20 {
    // public static void main (String args[]){
        
    //     System.out.println((5 & 6));
    //     System.out.println((5 | 6));
    //     System.out.println((5 ^ 6));
    //     System.out.println((~5));
    //     System.out.println((~0));
    //     System.out.println((5<<2));
    //     System.out.println((6>>1));  
    // }

    

    // public static void oddOReven(int n){
    //     int bitMask = 1;
    //     if((n & bitMask)==0){
    //         //even
    //         System.out.println("even no.");
    //     }else{
    //         System.out.println("odd no.");
    //     }
            
    // }

    // public static void main (String args[]){
    //     oddOReven(4);
    //     oddOReven(7);
    //     oddOReven(2);
    // }






    // public static int getithBit(int n, int i){
    //     int bitMask = 1<<i;
    //     if((n & bitMask)==0){
    //         return 0;
    //     }else{
    //         return 1;
    //     }
    // }


    // public static void main (String args[]){
    //     System.out.println(getithBit(10, 2));
    // }






    // public static int SetithBit(int n, int i){
    //     int bitMask = 1<<i;
    //     return n | bitMask;
        
    // }


    // public static void main (String args[]){
    //     System.out.println(SetithBit(10, 1));
    // }







    // public static int clearithBit(int n, int i){
    //     int bitMask = ~(1<<i);
    //     return n & bitMask;
        
    // }


    // public static void main (String args[]){
    //     System.out.println(clearithBit(10, 1));
    // }






    // public static int SetithBit(int n, int i){
    //     int bitMask = 1<<i;
    //     return n | bitMask;
        
    // }

    // public static int clearithBit(int n, int i){
    //     int bitMask = ~(1<<i);
    //     return n & bitMask;
        
    // }

    // public static int updateithBit(int n, int i, int newBit){
    //     // if (newBit == 0){
    //     //     return clearithBit(n, i);
    //     // } else {
    //     //     return SetithBit(n, i);
    //     // }

    //     n = clearithBit (n, i);
    //     int bitMask = newBit<<i;
    //     return n | bitMask;
    // }

    // public static void main (String args[]){
    //     System.out.println(updateithBit(10, 2, 1));
    // }





    // public static int cleariBit(int n, int i){
    //     int bitMask = ~(0)<<i;
    //     return n & bitMask;                      // cleR LAST I BITS
        
    // }

    // public static void main (String args[]){
    //     System.out.println(cleariBit(15, 2));
    // }





    // public static int cleariBitsinRange(int n, int i, int j){
    //     int a = ((~0)<<(j+1));
    //     int b = (1<<i)-1;
    //     int bitMask = a | b;
    //     return n & bitMask;                      
        
    // }

    // public static void main (String args[]){
    //     System.out.println(cleariBitsinRange(10, 2, 4 ));
    // }





    // public static boolean isPowerofTwo(int n){
    //     return (n&(n-1)) == 0;
    // }                                               //Q2 is power of 2

    // public static void main(String args[]){

    //     System.out.println(isPowerofTwo(15));
    // }





    // public static int countsetbit(int n){
    //     int count = 0;
    //     while(n>0){
    //         if ((n&1) !=0){
    //             count++;                         //Q3 count setbit
    //         }
    //         n = n>>1;
    //     }
    //     return count;
    // }

    //  public static void main(String args[]){
    //     System.out.println(countsetbit(15));
    // }






    // public static int fastexpo(int a, int n){
    //     int ans = 1;
    //     while(n>0){
    //         if ((n&1) !=0){       //check lsb
    //             ans = ans * a;                         
    //         }
    //         a = a* a;
    //         n = n>>1;
    //     }
    //     return ans;
    // }

    //  public static void main(String args[]){
    //     System.out.println(fastexpo(3, 5));
    // }






    /*           practise question          */



    //Q2   Swap two numbers without using any thirdvariable

    // public static void main(String[] args){
    //     int x = 3, y = 4;
    //     System.out.println("Before swap: x =" + x + "and y = " + y);
    //      //swap using xor

    //      x = x ^ y;
    //      y = x ^ y;
    //      x = x ^ y;

    //      System.out.println("after swap: x =" + x + "and y = " + y);

    // }





    //Q3   Add 1 to an integer using Bit Manipulation

    // public static void main(String[] args){

    //     int x = 6;

    //     System.out.println(x+ " + " + 1 + " is " + -~x);
         
    //     x = -4;

    //     System.out.println(x+ " + " + 1 + " is " + -~x);

    //     x = 0;

    //     System.out.println(x+ " + " + 1 + " is " + -~x);

    // }





    //Q4

    // public static void main(String[] args){
    //     // covert upper charecter to lower 

    //     for ( char ch = 'A'; ch<= 'Z'; ch++){
            
    //         System.out.println((char)(ch | ' '));
    //          // prints a to z
    //     }
    // }













}
