public class JavaBasic14 {


    // public static void hollow_rectangle(int totrows, int totcols) {
    //     // outer loop
    //     for (int i = 1; i <= totrows; i++) {
    //         // inner - columns
    //         for (int j = 1; j <= totcols; j++) {
    //             // cell-(i,j)
    //             if (i == 1 || i == totrows || j == 1 || j == totcols) {
    //                 // boundary cells
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         // move to next line after printing each row
    //         System.out.println();
    //     }
    // }

    // public static void main(String args[]) {
    //     // Example call to the function
    //     hollow_rectangle(5, 10);
    // }





    // public static void inverted_rotated_half_pyramid(int n){
    //     //outer
    //     for(int i=1; i<=n; i++){
    //         //space
    //         for(int j=1; j<= n-i; j++){
    //             System.out.print(" ");
    //         }

    //         //stars
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String args[]) {
    //     // Example call to the function
    //     inverted_rotated_half_pyramid(5);
    // }





    // public static void inverted_half_pyramid_withnumber(int n){
    //     for(int i=1; i<=n; i++){
    //         //inner-num
    //         for(int j=1; j<= n-i+1; j++){
    //             System.out.print(j+" ");

    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String args[]) {
    //     // Example call to the function
    //     inverted_half_pyramid_withnumber(5);
    // }




    // public static void floyds_triangle(int n){
    //     //outer
    //     int counter =1;

    //     for(int i=1; i<=n; i++){
    //         //inner- how many times will counter be printed
    //         for(int j=1; j<=i; j++){
    //             System.out.print(counter+" ");
    //             counter++;

    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[]) {
    //     // Example call to the function
    //     floyds_triangle(5);
    // }





    // public static void zero_triangle(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             if((i+j)%2 == 0){
    //                 System.out.print("1");
    //             }else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String args[]) {
    //     // Example call to the function
    //     zero_triangle(5);
    // }





    
    // public static void butterfly(int n) {
    //     // 1st half
    //     for (int i = 1; i <= n; i++) {
    //         // star - i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    
    //         // space - 2*(n-i)
    //         for (int j = 1; j <= 2 * (n - i); j++) {
    //             System.out.print(" ");
    //         }
    
    //         // star - i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    
    //     // 2nd half
    //     for (int i = n; i >= 1; i--) {
    //         // star - i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    
    //         // space - 2*(n-i)
    //         for (int j = 1; j <= 2 * (n - i); j++) {
    //             System.out.print(" ");
    //         }
    
    //         // star - i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    
    // public static void main(String[] args) {
    //     // Example call to the function
    //     butterfly(4);
    // }





    // public static void solid_rombus(int n){
    //     //outer
    //     for(int i=1; i<=n; i++){
    //         //space
    //         for(int j=1; j<= n-i; j++){
    //             System.out.print(" ");
    //         }

    //         //stars
    //         for(int j=1; j<=n; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String args[]) {
    //     // Example call to the function
    //     solid_rombus(5);
    // }





    // public static void hollow_rombus(int n){
    //     //outer
    //     for(int i=1; i<=n; i++){
    //         //space
    //         for(int j=1; j<= n-i; j++){
    //             System.out.print(" ");
    //         }

    //         //stars
    //         for(int j=1; j<=n; j++){
    //              if (i == 1 || i == n || j == 1 || j == n) {
    //                 // boundary cells
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String args[]) {
    //     // Example call to the function
    //     hollow_rombus(7);
    // }






    // public static void diamond(int n){
    //     //outer
    //     for(int i=1; i<=n; i++){
    //         //space
    //         for(int j=1; j<= n-i; j++){
    //             System.out.print(" ");
    //         }

    //         //stars
    //         for(int j=1; j<=(2*i)-1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }


    //     for(int i=n; i>=1; i--){
    //         //space
    //         for(int j=1; j<= n-i; j++){
    //             System.out.print(" ");
    //         }

    //         //stars
    //         for(int j=1; j<=(2*i)-1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String args[]) {
    //     // Example call to the function
    //     diamond(4);
    // }




    


}
























