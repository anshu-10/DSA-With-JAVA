public class JavaBasic12 {

    public static void main (String arg[]){


        for(int i = 1; i <=4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }




        // for(int i = 1; i <=4; i++){
        //     int n=4;
        //     for (int j = 1; j <=n-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }





        // int n = 4;
        // for(int i = 1; i <=n; i++){

        //     for (int number = 1; number <= i; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }




        // int n=4;
        //  for(int i = 1; i <=n; i++){
           
        //     for (int j = 1; j <=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }




         int n=4;
         char ch= 'A';
         for(int i = 1; i <=n; i++){
           
            for (int chars = 1; chars <=i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
    
}
