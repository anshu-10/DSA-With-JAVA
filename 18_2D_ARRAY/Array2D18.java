import java.util.Scanner;

public class Array2D18 {
    // public static boolean search(int matrix[][], int key ){
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //            if (matrix[i][j]== key){
    //             System.out.println("found at cell (" + i +","+ j+")");
    //             return true;
    //            }
    //         }
           
    //     }
    //     System.out.println("key not found");
    //     return false;
    // }



    // public static void main(String args[]) {
    //     int matrix[][] = new int[3][3];
    //     int n = matrix.length, m = matrix[0].length;

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the elements of the matrix:");
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             matrix[i][j] = sc.nextInt();
    //         }
    //     }

    //     // output
    //     System.out.println("The matrix is:");
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }

    //     search(matrix,5);

    // }






    //spiral
    // public static void printSpiral(int matrix[][]) {
    //     int startrow = 0;
    //     int startcol = 0;
    //     int endrow = matrix.length - 1;
    //     int endcol = matrix[0].length - 1;  

    //     while (startrow <= endrow && startcol <= endcol) {
    //         // top
    //         for (int j = startcol; j <= endcol; j++) {
    //             System.out.print(matrix[startrow][j] + " ");
    //         }
    //         startrow++;

    //         // right
    //         for (int i = startrow; i <= endrow; i++) {
    //             System.out.print(matrix[i][endcol] + " ");
    //         }
    //         endcol--;

    //         // bottom
    //         if (startrow <= endrow) {
    //             for (int j = endcol; j >= startcol; j--) {
    //                 System.out.print(matrix[endrow][j] + " ");
    //             }
    //             endrow--;
    //         }

    //         // left
    //         if (startcol <= endcol) {
    //             for (int i = endrow; i >= startrow; i--) {
    //                 System.out.print(matrix[i][startcol] + " ");
    //             }
    //             startcol++;
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void main(String args[]) {
    //     int matrix[][] = {
    //         {1, 2, 3, 4},
    //         {5, 6, 7, 8},
    //         {9, 10, 11, 12},
    //         {13, 14, 15, 16}
    //     };
    //     printSpiral(matrix);
    // }
    




//     public static int diagonalsum(int matrix[][]){
//         int sum = 0;

//     //     for(int i=0; i<=matrix.length; i++){
//     //         for(int j=0; j<matrix[0].length; j++){
//     //             if(i==j){
//     //                 sum += matrix[i][j];
//     //             }
//     //             else if(i+j == matrix.length-1){
//     //                 sum+= matrix[i][j];
//     //             }

//     //         }
//     //     }





//     for (int i = 0; i < matrix.length; i++) {
//         // Primary diagonal
//         sum += matrix[i][i];
        
//         // Secondary diagonal
//         if (i != matrix.length - i - 1) { // Avoid adding the center element twice in odd dimension matrices
//             sum += matrix[i][matrix.length - i - 1];
//         }
//     }




//         return sum;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16} };
//         System.out.println(diagonalsum(matrix));

//     }






    // public static boolean staircasesearch(int matrix[][], int key){
    //     int row=0, col= matrix[0].length-1;

    //     while(row<matrix.length && col >=0){
    //         if(matrix[row][col] == key){
    //             System.out.println("found key at("+row+", "+col+")");
    //             return true;
    //         }
    //         else if(key< matrix[row][col]){
    //             col--;
    //         }
    //         else{
    //             row++;
    //         }
    //     }
    //     System.out.println("not found");
    //     return false;
    // }



    // public static void main(String args[]) {
    //     int matrix[][] = {
    //         {10, 20, 30, 40},
    //         {15, 25, 35, 45},
    //         {27, 29, 37, 48},
    //         {32, 33, 39, 50} };
    //         int key = 33;
    //     staircasesearch(matrix,key);

    // }






    /*                 Practise Question                */



    // public static void main(String[] args) {
    //     int[][] array = {
    //         {4, 7, 8},
    //         {8, 8, 7}
    //     };
    //     int countOf7 = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         for (int j = 0; j < array[i].length; j++) {
    //             if (array[i][j] == 7) {
    //                 countOf7++;
    //             }
    //         }
    //     }
    //     System.out.println("Count of 7 is: " + countOf7);
    // }






    // public static void main(String[] args) {
    //     int[][] nums = {
    //         {1, 4, 9},
    //         {11, 4, 3},
    //         {2, 2, 3}
    //     };
    //     int sum = 0;
    //     // Sum of 2nd row elements
    //     for (int j = 0; j < nums[1].length; j++) {
    //         sum += nums[1][j];
    //     }
    //     System.out.println("Sum is: " + sum);
    // }






    // public static void main(String[] args) {
    //     int row = 2, column = 3;
    //     int[][] matrix = {
    //         {2, 3, 7},
    //         {5, 6, 7}
    //     };
    //     // Display original matrix
    //     printMatrix(matrix);
        
    //     // Transpose the matrix
    //     int[][] transpose = new int[column][row];
    //     for (int i = 0; i < row; i++) {
    //         for (int j = 0; j < column; j++) {
    //             transpose[j][i] = matrix[i][j];
    //         }
    //     }
    //     // Print the transposed matrix
    //     printMatrix(transpose);
    // }

    // public static void printMatrix(int[][] matrix) {
    //     System.out.println("The matrix is: ");
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }





}
