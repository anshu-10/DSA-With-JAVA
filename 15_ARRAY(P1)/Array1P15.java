import java.util.Scanner;

public class Array1P15 {



    // public static void main(String args[]){


    //     // int marks[] = new int[50];

    //     // int numbers[]= {1, 2, 3};  //3 size





    //     int marks[] = new int[100];
        
    //     Scanner sc = new Scanner(System.in);
    //     // int phy;
    //     // phy = sc.nextInt();


    //     System.out.println("length of Array =" + marks.length);     // show length

    //     marks[0] = sc.nextInt();
    //     marks[1] = sc.nextInt();
    //     marks[2] = sc.nextInt();

    //     System.out.println("phy:" + marks[0]);
    //     System.out.println("maths:" + marks[1]);
    //     System.out.println("chem:" + marks[2]);

    //     marks[1] = 100;                                //for update mrk

    //     System.out.println("maths:" + marks[1]);


    //     marks[2] = marks[2] + 1;                       //increase mrks
    //     System.out.println("chem:" + marks[2]);


    //     int  perc = (marks[0] + marks[1] + marks[2]) /3;       //for percentage
    //     System.out.println("perc =" +perc + "%");

    //      }





    // public static void update(int marks[]){
    //     for (int i=0; i< marks.length; i++){
    //         marks[i]= marks[i] + 1; 

    //     }
    // }
    // public static void main(String args[]){
    //     int marks[] = {97, 98, 99};
    //     update(marks);

    //     //print our marks
    //     for(int i = 0; i<marks.length; i++){
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();
    // }







    // public static void update(int marks[], int nonchangable){
    //     nonchangable = 10; // This won't affect the nonchangable in main
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] + 1; 
    //     }
    // }
    
    // public static void main(String args[]){
    //     int marks[] = {97, 98, 99};
    //     int nonchangable = 5;
    //     update(marks, nonchangable);
    //     System.out.println(nonchangable); // This will still print 5
    
    //     // print out marks
    //     for (int i = 0; i < marks.length; i++) {
    //         System.out.print(marks[i] + " ");
    //     }
    //     System.out.println();
    // }
    





    // public static int linearsearch(int number[], int key){
    //     for(int i = 0; i < number.length; i++){
    //         if(number[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    // public static void main(String args[]) {
    //     int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
    //     int key = 10;
    
    //     int index = linearsearch(number, key);
    //     if(index == -1){
    //         System.out.println("not found");
    //     } else {
    //         System.out.println("key is at index " + index);
    //     }
    // }






    // public static int linearsearch(int number[], int key, String menu[], int toEat){
    //     for(int i = 0; i < number.length; i++){
    //         if(number[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    // public static void main(String args[]) {
    //     int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
    //     String menu[] = {"dosa", "samosa", "kachri", "pakaode"};
    //     int key = 10;
    //     int toEat = 1; // Assuming 1 is the index for "samosa"
    
    //     int index = linearsearch(number, key, menu, toEat);
    //     if(index == -1){
    //         System.out.println("not found");
    //     } else {
    //         System.out.println("key is at index " + index);
    //         System.out.println("You can eat: " + menu[toEat]);
    //     }
    // }
    
    




    // public static int findMenuIndex(String menu[], String item) {
    //     for (int i = 0; i < menu.length; i++) {
    //         if (menu[i].equals(item)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String args[]) {
        
    //     String menu[] = {"dosa", "samosa", "kachri", "pakaode"};
       
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter the menu item: ");
    //     String toEat = scanner.nextLine();

    //     int toEatIndex = findMenuIndex(menu, toEat);
        
    //     if (toEatIndex == -1) {
    //         System.out.println(toEat + " not found in menu");
    //     } else {
    //         System.out.println(toEat + " is at menu index: " + toEatIndex);
    //     }

    // }






    // public static int getlargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE; //-infinity

    //     for(int i=0; i<numbers.length; i++){
    //         if(largest < numbers[i]){
    //             largest = numbers[i];
    //         }
    //     }

    //     return largest;
    // }

    // public static void main(String args[]){
    //     int numbers[] = {1, 2, 6, 3, 5};
    //     System.out.println("largest value is :" + getlargest(numbers));
    // }






    // public static int getlargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE; // -infinity
    //     int smallest = Integer.MAX_VALUE; // +infinity
    
    //     for(int i = 0; i < numbers.length; i++){
    //         if(largest < numbers[i]){
    //             largest = numbers[i];
    //         }
    //         if(smallest > numbers[i]){
    //             smallest = numbers[i];
    //         }
    //     }
    //     System.out.println("smallest value is: " + smallest);
    
    //     return largest;
    // }
    
    // public static void main(String args[]){
    //     int numbers[] = {1, 2, 6, 3, 5};
    //     System.out.println("largest value is: " + getlargest(numbers));
    // }





    // public static int binarysearch(int numbers[], int key){
    //     int start = 0, end = numbers.length - 1;
    
    //     while(start <= end){
    //         int mid = (start + end) / 2;
    
    //         // comparisons                             //binary search
    //         if(numbers[mid] == key){                   //TC = O(log n)
    //             return mid;
    //         }
    //         if(numbers[mid] < key){  // right
    //             start = mid + 1;
    //         } else {  // left
    //             end = mid - 1;
    //         }
    //     }
    
    //     return -1;
    // }
    
    // public static void main(String args[]){
    //     int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    //     int key = 10;
    
    //     System.out.println("index for key is: " + binarysearch(numbers, key));
    // }





    // public static void reverse(int numbers[]){
    //     int first = 0, last = numbers.length-1;

    //     while(first < last){
    //         //swap
    //         int temp = numbers[last];              //TC = n
    //         numbers[last] = numbers[first];        //SC = constant =1
    //         numbers[first] = temp;

    //         first++;
    //         last--;

    //     }
    // }

    // public static void main(String args[]){
    //     int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    //     reverse(numbers);


    //     //print
    //     for(int i = 0; i<numbers.length; i++){
    //         System.out.print(numbers[i]+" ");
    //     }
    //     System.out.println();
    // }





    // public static void printPairs(int numbers[]){
    //     for(int i= 0; i<numbers.length; i++){
    //         int curr = numbers[i]; //2, 4, 6, 8, 10
    //         for(int j=i+1; j<numbers.length; j++){
    //             System.out.print("( " + curr + "," +numbers[j] + " )");
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void main(String args[]){
    //     int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    //     printPairs(numbers);
    // }






    // public static void printSubarrays(int numbers[]){
    //     for(int i = 0; i<numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             for(int k = start; k<=end; k++){
    //                 System.out.print(numbers[k]+" "); //subarray
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String args[]){
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     printSubarrays(numbers);
    // }





    // public static void printSubarrays(int numbers[]) {
    //     int ts = 0;
    //     for (int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for (int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             for (int k = start; k <= end; k++) {
    //                 System.out.print(numbers[k] + " "); // subarray
    //             }
    //             System.out.println();
    //             ts++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total subarrays = " + ts);
    // }

    // public static void main(String args[]) {
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     printSubarrays(numbers);
    // }





    // public static void printSubarrays(int numbers[]) {
    //     int ts = 0;
    //     int overallSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int minSum = Integer.MAX_VALUE;

    //     for (int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for (int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             int currentSum = 0;
    //             for (int k = start; k <= end; k++) {
    //                 System.out.print(numbers[k] + " "); // subarray
    //                 currentSum += numbers[k];
    //             }
    //             System.out.println(" Sum: " + currentSum);
    //             ts++;
    //             overallSum += currentSum;
    //             if (currentSum > maxSum) {
    //                 maxSum = currentSum;
    //             }
    //             if (currentSum < minSum) {
    //                 minSum = currentSum;
    //             }
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total subarrays = " + ts);
    //     System.out.println("Overall sum of all subarrays = " + overallSum);
    //     System.out.println("Maximum subarray sum = " + maxSum);
    //     System.out.println("Minimum subarray sum = " + minSum);
    // }

    // public static void main(String args[]) {
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     printSubarrays(numbers);
    // }








    



    
}
