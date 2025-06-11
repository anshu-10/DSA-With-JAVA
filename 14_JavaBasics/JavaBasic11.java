import java.util.Scanner;

public class JavaBasic11 {
    public static void main(String arg[]){
        Scanner sc = new Scanner ( System.in);



        // int counter = 0;
        // while(counter < 10){
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("printed HW 10x");
    



        // int counter = 1;
        // while(counter <= 10){
        //     System.out.println(counter+" ");
        //     counter++;
        // }




        // int counter = 1;
        // while(counter <= 10){
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        // System.out.println();




        // int counter = 1;
        // while(counter <= 1000){
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        // System.out.println();



        // int range = sc. nextInt();
        // int counter = 1;

        // while(counter<= range){
        //     System.out.println(counter +" ");
        //     counter++;

        // }
        // System.out.println();




        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i<=n){
            sum +=i;
            i++;
        }

        System.out.println("sum is:" +sum );



         
        // for(int i = 1; i <= 10; i++) {
        //     System.out.println("Hello World");
        // }



        // for(int i = 1; i <= 4; i++) {
        //     System.out.println("* * * *");
        // }



        // int i = 1;
        // while( i<=4){
        //     System.out.println("* * * *");
        //     i++;
        // }




        // int n = 10899;

        // while( n > 0){
        //     int Lastdigit = n % 10;
        //     System.out.print(Lastdigit);                          // reverse the number
        //     n=n/10;     //n/=10
        // }
        // System.out.println();
        
        
        


        //  int n = 10899;
        //  int  rev = 0;

        // while( n > 0){
        //     int Lastdigit = n % 10;
        //     rev = ( rev * 10) + Lastdigit;
            
        //     n=n/10;
        // }
        // System.out.println(rev);

        




        // int i = 1;
        // do{
        //     System.out.println("Hello World");                // do nwhile loop
        //     i++;

        // }while( i<=10);





        // for (int i=1; i<=5; i++){
        //     if(i==3){
        //         break;                                               // break statement
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("i am out of the loop");




        // do{
        //     System.out.println("enter your number");
        //     int n = sc.nextInt();
        //     if(n %10==0){
        //         break;

        //     }System.out.println(n);
        // }while(true);





        // for(int i=1;i<=5;i++){
        //     if (i==3){
        //         continue;                                     //continue statement
        //     }System.out.println(i);

        // }





        // do {
        //     System.out.println("enter your number: ");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println("your no. is :" +n);
            
        // }while(true);





        // int n = sc.nextInt();
        
        // if (n <= 1) {
        //     System.out.println("n is not prime");                // 0 and 1 are not considered prime
        // } else if (n == 2) {
        //     System.out.println("n is prime");
        // } else {
        //     boolean isprime = true;
        //     for (int i = 2; i <= Math.sqrt(n); i++) {           // We only need to check up to the square root of n
        //         if (n % i == 0) {
        //             isprime = false;
        //             break;                                      // If n is divisible by any number, it's not prime, so we can break out of the loop
        //         }
        //     }
        //     if (isprime) {
        //         System.out.println("n is prime");
        //     } else {
        //         System.out.println("n is not prime");
        //     }
        // }
    



        /*               practice Question                */




        // for(int i=0;i<5;i++) {
        //     System.out.println("Hello");
        //     i+=2;
        // }





        // int num;
        // int choice;
        // int evensum = 0;
        // int oddsum = 0;

        // do {
        //     System.out.println("Enter the number:");
        //     num = sc.nextInt();

        //     if (num % 2 == 0) {
        //         evensum += num;
        //     } else {
        //         oddsum += num;
        //     }

        //     System.out.println("Do you want to enter another number? (1 for Yes, 0 for No)");
        //     choice = sc.nextInt();

        // } while (choice == 1);

        // System.out.println("Sum of even numbers: " + evensum);
        // System.out.println("Sum of odd numbers: " + oddsum);





        // int num; // To hold number
        // int fact = 1; // To hold factorial

        // System.out.print("Enter any positive integer:");
        // num = sc.nextInt();

        // for (int i = 1; i <= num; i++) {
        //     fact *= i;
        // }

        // System.out.println("Factorial: " + fact);

        


                           /* Que 4 reaining by me  */

   }    

} 


    

