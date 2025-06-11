import java.util.Scanner;

public class JavaBasic13 {



                  /*   call by value   */


    // public static void printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");

    // }

    // public static void main (String arg[]){
    //     printHelloWorld();   //function call
    // }
    



    // public static int printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     return 3;

    // }

    // public static void main (String arg[]){
    //     printHelloWorld();   //function call
    // }





    // public static int calculatesum(int num1, int num2) {
    //     int sum = num1 + num2;
    //     return sum;
    // }

    // public static void main(String arg[]){
    //     //swap

    //     int a = 5;
    //     int b = 10;


    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a=" +a);
    //     System.out.println("b=" +b);
    // }




    // public static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a=" +a);
    //     System.out.println("b=" +b);
    // }

    // public static void main(String arg[]){
    //     //swap

    //     int a = 5;
    //     int b = 10;
    //     swap(a, b);
 
    // }





    // public static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a=" +a);
    //     System.out.println("b=" +b);
    // }

    // public static void main(String arg[]){
    //     //swap

    //     int a = 5;
    //     int b = 10;
    //     swap(a, b);
 
    // }





    //  public static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
   
    // }

    // public static void main(String arg[]){
    //     //swap

    //     int a = 5;                             //output =original value
    //     int b = 10;
    //     swap(a, b);
    //     System.out.println("a=" +a);
    //     System.out.println("b=" +b);
 
    // }




   //  public static int mul(int a, int b){
   //      int product = a * b;
   //      return product;
   //  }

   //  public static void main(String args[]){

   //      int a = 3;
   //      int b = 5;                                            //multiplication
   //      int prod = mul(a, b);
   //      System.out.println("a * b =" +prod);
   //      prod = mul (15,2);
   //      System.out.println("a * b =" +prod);
   //  }





    public static int factorial(int n){
        int f = 1;

        for (int i = 1; i <= n; i++){
            f = f *i;                                            // factorial
        }

        return f;
    }

    public static void main(String args[]){
        System.out.println(factorial(4));
    }






    // public static int factorial(int n){
    //     int f = 1;

    //     for (int i = 1; i <= n; i++){
    //         f = f *i;                                           
    //     }

    //     return f;
    // }

    // public static int bicoeff( int n, int r){
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);                         // binomial factorial

    //     int bicoeff = fact_n/(fact_r*fact_nmr);
    //     return bicoeff;
    // }

    // public static void main(String args[]){
    //     System.out.println(bicoeff(5, 2));
    // }




      
    //    //func to calculate 2 num
    // public static int sum(int a, int b){
    // return a+b;
    // }

    //    //func to calculate 3 num
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }

    // public static void main(String arg[]){
    //     System.out.println(sum(5,4));
    //     System.out.println(sum(5,2,3));
    // }






    //    //func to calculate 2 num
    // public static int sum(int a, int b){
    // return a+b;
    // }

    //    //func to calculate float num
    // public static float sum(float a, float b){
    //     return a+b;
    // }

    // public static void main(String arg[]){
    //     System.out.println(sum(5,4));
    //     System.out.println(sum(5.1f,2.3f));
    // }





    // public static boolean isprime(int n){
    //     boolean isprime = true;
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i == 0){ // completely dividing
    //             isprime = false;                                                 //prime or not
    //             break;
    //         }
    //     }
    //     return isprime;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isprime(12));
    // }





    // public static boolean isprime(int n){
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i == 0){ // completely dividing
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isprime(12));
    // }





    // //only for n>=2
    //  public static boolean isprime(int n){
    //     //corner cases
    //     //2
    //     if (n==2){
    //         return true;
    //     }
        
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i == 0){ // completely dividing
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isprime(2));
    // }





    //   public static boolean isprime(int n){
    //     if (n==2){
    //         return true;
    //     }
        
    //     for(int i=2; i<=Math.sqrt(n); i++){
    //         if(n%i == 0){ // completely dividing
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isprime(2));
    // }





    //     public static boolean isprime(int n){
    //     if (n==2){
    //         return true;
    //     }

        
    //     for(int i=2; i<=Math.sqrt(n); i++){
    //         if(n%i == 0){ // completely dividing
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    // public static void primeinrange(int n){
    //     for (int i=2; i<=n; i++){
    //         if (isprime(i)){ //true
    //             System.out.print(i+" ");
    //         }
    //     }
    //     System.out.println();
    // }


    // public static void main(String[] args) {
    //    primeinrange(20);       // 2 to 20
    // }





    // public static void bintodec(int binnum){
    //     int mynum = binnum;
    //     int pow =0;
    //     int decnum = 0;

    //     while(binnum>0){
    //         int lastdigit = binnum%10;
    //         decnum = decnum +(lastdigit * (int)Math.pow(2, pow));

    //         pow++;                                                                 // binary to decimal
    //         binnum = binnum/10;
    //     }
    //     System.out.println("decimal of"+ mynum +" ="+ decnum);
    // }

    // public static void main(String arg[]){
    //     bintodec(111);
    // }







   //  public static void dectobin(int n){
   //      int mynum = n;
   //      int pow = 0;
   //      int binnum = 0;


   //      while (n>0){
   //          int rem = n%2;
   //          binnum =binnum +(rem *(int)Math.pow(10,pow));
   //          pow++;                                                     // decimal to binary
   //          n = n/2;
   //      }

   //      System.out.println("binary form of of"+ mynum +" ="+ binnum);
   //  }

   //  public static void main(String arg[]){
   //      dectobin(23);
   //  }






                    /*        Practise Question             */





   // public static double average(double x,double y,double z) {

   //    return(x+y+z) /3;
   // }

   // public static void main(String arg[]){
   //    Scanner sc = new Scanner(System.in);

   //    System.out.print("Input first number");
   //    double x= sc.nextDouble();                                               // average of 3 no.

   //    System.out.print("Input second number");
   //    double y= sc.nextDouble();

   //    System.out.print("Input Third number");
   //    double z= sc.nextDouble();

   //    System.out.print(" The average value is " + average(x,y,z)+"\n");

   // }
   




   // public static boolean isEven(int number) {

   //    if(number %2 == 0) {
   //       return true;

   //    }else{
   //       return false;
   //    }
   // }
   //                                                               // even or not
   // public static void main(String[]args) {

   //       Scanner sc=new Scanner(System.in);
   //       int num;

   //       System.out.print("Enter an integer: ");
   //       num = sc.nextInt();

   //       if(isEven(num)) {
   //          System.out.println("Number is even");
   //       }else{
   //          System.out.println("Number is odd");
        

   //    }

   // }





//    public static boolean isPalindrome(int number){
//       int palindrome = number; // copied number into variable
//       int reverse = 0;
  
//       while(palindrome != 0) {
//           int remainder = palindrome % 10;
//           reverse = reverse * 10 + remainder;                    //palidrome or not
//           palindrome = palindrome / 10;
//       }
  
//       // Compare the original number with the reversed number
//       return number == reverse;
//   }
  
//    public static void main(String arg[]) {

//       System.out.println("Please Enter a number :");

//       Scanner sc=new Scanner(System.in);

//       int palindrome=sc.nextInt();
      

//       if(isPalindrome(palindrome)) {
//          System.out.println("Number : "+palindrome+" is a palindrome");

//       }else{
//          System.out.println("Number : "+palindrome+" is not a palindrome");
//       }


//    }







// QUE 4


// public static int findMin(int x, int y) {
//    return Math.min(x, y);
// }

// // Method to find the maximum of two numbers
// public static int findMax(int x, int y) {
//    return Math.max(x, y);
// }

// // Method to calculate the square root of a number
// public static double calculateSqrt(double x) {
//    return Math.sqrt(x);
// }

// // Method to calculate the power of a number
// public static double calculatePow(double base, double exponent) {
//    return Math.pow(base, exponent);
// }

// // Method to calculate the absolute value of a number
// public static int calculateAbs(int x) {
//    return Math.abs(x);
// }

// // Method to calculate the average of an array of numbers
// public static double calculateAverage(double[] numbers) {
//    double sum = 0.0;
//    for (double num : numbers) {
//        sum += num;
//    }
//    return sum / numbers.length;
// }


// public static void main(String[] args) {
//    // Test values
//    int a = 10, b = 20;
//    double num = 25.0;
//    double base = 2, exponent = 3;
//    int negativeNumber = -10;
//    double[] numbers = {10.0, 20.0, 30.0, 40.0};

//    // Using the methods
//    System.out.println("Min of " + a + " and " + b + ": " + findMin(a, b));
//    System.out.println("Max of " + a + " and " + b + ": " + findMax(a, b));
//    System.out.println("Square root of " + num + ": " + calculateSqrt(num));
//    System.out.println(base + " raised to the power of " + exponent + ": " + calculatePow(base, exponent));
//    System.out.println("Absolute value of " + negativeNumber + ": " + calculateAbs(negativeNumber));
//    System.out.println("Average of the array: " + calculateAverage(numbers));
// }


   



// public static void main(String[]args) {
//                                                        //sum of digit
//    Scanner sc=new Scanner(System.in);

//    System.out.print("Input an integer: ");
//    int digits=sc.nextInt();

//    System.out.println("The sum is "+sumDigits(digits));                 
// }

// public static int sumDigits(int n) {
//    int sumOfDigits=0;
   
//    while(n>0) {
//       int lastDigit = n%10;
//       sumOfDigits += lastDigit;
//       n/=10;
//    }return sumOfDigits;
// }





}














       



     









