import java.util.Scanner;

public class JavaBasic10 {
    public static void main (String args[]){

        Scanner sc = new Scanner ( System.in);
        // int age = 16;
        // if (age >= 18) {
        //     System.out.println("teenager");

        // }
        // if (age>13 && age< 18){
        //     System.out.println("not teenager");
        // }
        // else{
        //     System.out.println("not adult");
        // }




        // int a = 10;
        // int b = 5;
        //  if ( a>= b){
        //     System.out.println("A is largest of 2");
        //  }else{
        //     System.out.println("b is largest of 2");
        //  }




        // int number = sc.nextInt();

        // if ( number % 2 ==0){
        //     System.out.println("even");                                // all conditon check
        // }
        // else{
        //     System.out.println("odd");
        // }




        //  int age = 22;
        // if (age >= 18) {
        //     System.out.println("adult");

        // }
        //  else if (age>=13 && age< 18){
        //     System.out.println("teenager");                   // if previous cond T then next check nhi hongi
        // }
        // else{
        //     System.out.println("child");
        // }




        // int income= sc.nextInt();
        // int tax;
        // if (income < 500000) {
        //     tax = 0;
        // } else if (income >= 500000 && income < 1000000) {
        //     tax = (int) (income * 0.2);
        // } else {
        //     tax = (int) (income * 0.3);
        // }

        // System.out.println("Your tax is: " + tax);




        // int A = 1 , B = 3 , C = 6;

        // if((A >= B) && ( A >=C)) {

        //     System.out.println(" largest is A "  ) ;

        // }else if(B >= C){

        //    System.out.println("largest is B");
        // }else {

        //    System.out.println("largest is C ") ;

        // }




        // int num = 4;

        // String type = ((num%2)==0) ? "even" : "odd";           // ternary operator (conditional statement)
        // System.out.println(type);




        //  int number = 2;
        //  switch (number){
        //     case 1 : System.out.println( "samosa");
        //     case 2 : System.out.println("burger");                 // switch case
        //     case 3 : System.out.println(" mango"); 
        //     default : System.out.println("we wake up");
        //  }




        //   int number = 2;
        //  switch (number){
        //     case 1 : System.out.println( "samosa");
        //                 break;
        //     case 2 : System.out.println("burger");
        //                 break;
        //     case 3 : System.out.println(" mango"); 
        //                 break;
        //     default : System.out.println("we wake up");
        //  }




        System.out.println( " enter a: ");
        int a = sc.nextInt();
        System.out.println( " enter b: ");
        int b = sc.nextInt();
        System.out.println( "enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break; 
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                    System.out.println(a / b);                // calculator
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }





        /*               practise question            */





       

        // int x = sc.nextInt();
        // if (x>0) {

        //     System.out.println(" it is positive ");                // psitive or negative

        // }else{
            
        //     System.out.println(" it is negative ");

        // }




        // double temp=103.5;

        // if(temp>100) {

        //     System.out.println("You have a fever");

        // }else{

        //     System.out.println("You don't have a fever");
        // }





        // System.out.println("Enter week number(1-7): ");
        
        // int week=sc.nextInt();
        // switch(week) {
        //     case 1:System.out.println("Monday");
        //     break;

        //     case 2:System.out.println("Tuesday");
        //     break;
            
        //     case 3:System.out.println("Wednesday");
        //     break;
            
        //     case 4:System.out.println("Thursday");
        //     break;

        //     case 5:System.out.println("Friday");
        //     break;
            
        //     case 6:System.out.println("Saturday");
        //     break;
            
        //     case 7:System.out.println("Sunday");
        //     break;
            
        //     default:System.out.println("Invalidinput!Pleaseenterweeknumberbetween1-7.");


        // }





        // int a = 63, b = 36;

        // boolean X = (a < b) ? true : false;

        // int Y = (a > b) ? a : b;

        // System.out.println(X);
        // System.out.println(Y);






        // System.out.print("Input the year: ");
        
        // int year=sc.nextInt();
        
        // boolean x= (year%4) ==0;
        // boolean y= (year%100) !=0;
        // boolean z= ((year%100==0) && (year%400==0));

        // if (x && (y||z)) {
        //     System.out.println(year+" is a leap year");
        
        // }else{
        //     System.out.println(year+" is not a leapyear");
        
        // }
        



      
    





        

    }
}
