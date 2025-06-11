import java.util.Arrays;
import java.util.Scanner;

public class Strings19 {

    public static void printletter(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }






    public static boolean ispalidrome(String str){
        for(int i = 0; i < str.length() / 2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)){
                // not a palindrome
                return false;
            }
        }
        return true;
    }






    public static float getShortestpath(String path) {
        int x = 0, y = 0;

        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            // Convert to lowercase to handle both cases
            dir = Character.toLowerCase(dir);
            
            // south
            if(dir == 's'){
                y--;
            }
            // north
            else if(dir == 'n'){
                y++;
            }
            // west
            else if(dir == 'w'){
                x--;
            }
            // east
            else if(dir == 'e') {
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2 + Y2);
    }





    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }






    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i<str.length(); i++){
            if (str.charAt(i) == ' ' && i< str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }





    public static String compress(String str){
        String newStr = "";
        //aaabc
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count>1){
                newStr += count.toString();
            }

        }
        return newStr;
    }
    

    
    public static void main(String args[]){
        



    //     char arr[] = {'a', 'b', 'c', 'd'};
    //     String str = "abcd";
    //     String str2 = new String("xyz");

    //     //strings are IMMUTABLE

    //     Scanner sc = new Scanner(System.in);
    //     String name;
    //     name = sc.nextLine();
    //     System.out.println(name);





        // String fullname  = " Tony Stark ";
        // System.out.println(fullname.length());



        //concatanation
        // String firstname = " anshu ";
        // String lastname = " Jamare ";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname +"is this");





        //concatanation
        // String firstname = "anshu";
        // String lastname = "Jamare";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname.charAt(0));




        // String firstname = "anshu";
        // String lastname = "Jamare";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname.charAt(1));






        // String firstname = "anshu";
        // String lastname = "Jamare";
        // String fullname = firstname + " " + lastname;
        
        // printletter(fullname);





        // String str = "racecar";
        // System.out.println(ispalidrome(str));



        
        // String path = "WNEENESENNN";
        // System.out.println(getShortestpath(path));




        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String ("Tony");

        // if (s1 == s2){
        //     System.out.println("strings are eyual");
        // }else{
        //     System.out.println("system are not equal");
        // }


        // // if (s1 == s3){
        // //     System.out.println("strings are eyual");
        // // }else{
        // //     System.out.println("system are not equal");
        // // }


        // if( s1.equals(s3)){
        //     System.out.println("strings are eyual");
        // }else{
        //     System.out.println("system are not equal");
        // }





        // //substring
        // String str = "HelloWorld";
        // System.out.println(substring(str, 0, 5));





        // String str = "HelloWorld";                         //java function
        // System.out.println(str.substring( 0, 5));





        // String fruits [] = {" apple","mango","banana"};

        // String largest = fruits[0];
        // for(int i = 1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);






        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch<='z'; ch++){
        //     sb.append(ch);
        // }// abcdefghijklnop
        // //0(26)
        // //0(n^2)  += instead of append
        // System.out.println(sb);

        // // System.out.println(sb.length());



    


        // String str = "hi i am anshu";
        // System.out.println(toUpperCase(str));






        // String str = "aaaabbbccccdee";
        // System.out.println(compress(str));






        /*                Practise question                    */



        //Q1

        // Scanner scanner = new Scanner(System.in);
        
        // // Read the next string from the input
        // System.out.println("Enter a string:");
        // String str = scanner.nextLine();
        
        // // Initialize a counter for lowercase vowels
        // int count = 0;
        
        // // Loop through each character in the string
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
            
        //     // Check if the character is a lowercase vowel
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         count++;
        //     }
        // }
        
        // // Print the count of lowercase vowels
        // System.out.println("Count of lowercase vowels is: " + count);




        //or
        // String str=new Scanner(System.in).next();
        // int count=0;

        // for(int i=0; i<str.length(); i++) {
        //     char ch = str.charAt(i);
    
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
        //         count++;
        //     }
        // }
        
        // System.out.println("count of vowels is :"+count);
    








        //Q2

        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";

        // System.out.println(str.equals(str1) +" "+str.equals(str2));






        //Q3

        String str="ApnaCollege".replace("l","");
        System.out.println(str);



        //Q4

        Scanner scanner = new Scanner(System.in);
        
        // Read the first string from the user
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        
        // Read the second string from the user
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        
        // Remove all whitespace and convert to lowercase for accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Initialize a boolean variable to store the result
        boolean areAnagrams = true;
        
        // If lengths are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            areAnagrams = false;
        } else {
            // Convert strings to char arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            
            // Sort the char arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            
            // Compare sorted char arrays
            areAnagrams = Arrays.equals(charArray1, charArray2);
        }
        
        // Print the result
        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");



        }

    }


}


