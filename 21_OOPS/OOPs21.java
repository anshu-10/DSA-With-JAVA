// public class OOPs21 {
//     public static void main(String args[]){
//         Pen p1 = new Pen(); // created a pen object call p1
//         p1.setcolor("Blue");
//         System.out.println(p1.color);
//         p1.settip(5);
//         System.out.println(p1.tip);
//         p1.setcolor("Yellow");  //  / p1.setcolor = "Yellow";
//         System.out.println(p1.color);


//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "shradhakhapra";
//         myAcc.setPassword("abcdefghi");
//     }
    
// }


// class BankAccount{
//     public String username;
//     private String password;
    
//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }

// class Pen{
//     String color;
//     int tip;

//     void setcolor(String newColor){
//        color = newColor ;
//     }

//     void settip(int newTip){
//         tip = newTip;
//     }
// }

// class Student {
//     String name;
//     int age;
//     float percentage;

//     void calcpercentage(int phy, int chem, int math){
//         percentage = (phy + chem + math)/3 ;
//     }
// }








// public class OOPs21 {
//     public static void main(String args[]){
//         Pen p1 = new Pen(); // created a pen object call p1
//         p1.setcolor("Blue");
//         System.out.println(p1.getColor());
//         p1.settip(5);
//         System.out.println(p1.gettip());
//         p1.setcolor("Yellow");  //  / p1.setcolor = "Yellow";
//         System.out.println(p1.getColor());
//     }
    
// }

// class Pen{
//     private String color;
//     private int tip;

//     String getColor(){
//         return this.color;
//     }

//     int gettip() {
//         return this.tip;
//     }

//     void setcolor(String newColor){
//        color = newColor ;
//     }

//     void settip(int newTip){
//         tip = newTip;
//     }
// }






// public class OOPs21 {
//     public static void main(String args[]){
//         Student s1 = new Student("anshu");
//         System.out.println(s1.name);
//     }
// }

// class Student{
//     String name;
//     int roll;

//     Student(String name){
//         this.name = name;

//     }
// }




// public class OOPs21 {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         // System.out.println(s1.name);
//     }
// }

// class Student{
//     String name;
//     int roll;

//     Student(){
//         System.out.println("constructer is called");

//     }
// }






// public class OOPs21 {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         // System.out.println(s1.name);
//     }
// }

// class Student{
//     String name;
//     int roll;

//     Student(){                                                   //we don't took parameter so non para...
//         System.out.println("constructer is called");

//     }
// }





// public class OOPs21 {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         Student s2 = new Student("anshu");
//         Student s3 = new Student(123);
//         // Student s4 = new Student("aman",567);   //this line showing error due to string and integer
        
//     }
// }

// class Student{                              //parameterized
//     String name;
//     int roll;

//     Student(){
//         System.out.println("constructer is called");
//     }

//     Student(String name){
//         this.name = name;
//     }

//     Student(int roll){
//         this.roll = roll;
//     }
// }







// public class OOPs21 {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "anshu";
//         s1.roll = 456;
//         s1.password = "abcd";
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         Student s2 = new Student(s1);
//         s2.password = "xyz";
//         s1.marks[2] = 100;

//         for(int i=0; i<3; i++){
//             System.out.println(s2.marks[i]);
//         }

//     }
// }

// class Student{                              
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     class Address{
//         String city;
//     }


//     //copy constructor
//     Student(Student s1){
//         marks= new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
        
//     }

//     Student(){
//         marks= new int[3];
//         System.out.println("constructer is called");
//     }

//     Student(String name){
//         marks= new int[3];
//         this.name = name;
//     }

//     Student(int roll){
//         marks= new int[3];
//         this.roll = roll;
//     }
// }







// public class OOPs21 {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "anshu";
//         s1.roll = 456;
//         s1.password = "abcd";
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         Student s2 = new Student(s1);
//         s2.password = "xyz";
//         s1.marks[2] = 100;

//         for(int i=0; i<3; i++){
//             System.out.println(s2.marks[i]);
//         }

//     }
// }

// class Student{                              
//     String name;
//     int roll;
//     String password;
//     int marks[];

    


//     // //Shallow copy constructor
//     // Student(Student s1){
//     //     marks= new int[3];
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;
//     //     this.marks = s1.marks;  
//     // }


//     //deep copy constructor
//         Student(Student s1){
//             marks = new int[3];
//             this.name = s1.name;
//             this.roll = s1.roll;
//             for(int i=0; i<marks.length; i++){
//                 this.marks[i] = s1.marks[i];
//             }
//         }



//     Student(){
//         marks= new int[3];
//         System.out.println("constructer is called");
//     }

//     Student(String name){
//         marks= new int[3];
//         this.name = name;
//     }

//     Student(int roll){
//         marks= new int[3];
//         this.roll = roll;
//     }
// }






// public class OOPs21 {
//     public static void main(String args[]){
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }

// //Base class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }


// //derived class
// class Fish extends Animal{
//     int fish;

//     void swim(){
//         System.out.println("swim in water");
//     }

// }








// public class OOPs21 {                              //multilevel
//         public static void main(String args[]){
//             Dog dobby = new Dog();
//             dobby.eat();
//             dobby.legs= 4;
//             System.out.println(dobby.legs);
//         }
//     }
    
//     //Base class
//     class Animal{
//         String color;
//         void eat(){
//             System.out.println("eats");
//         }
    
//         void breathe(){
//             System.out.println("breathes");
//         }
//     }
    
    
//     //derived class
//     class Fish extends Animal{
//         int fish;
    
//         void swim(){
//             System.out.println("swim in water");
//         }
    
//     }

//     class Mammals extends Animal{
//         int legs;
//     }

//     class Dog extends Mammals{
//         String breed;
//     }








// public class OOPs21 {                              //hierarchial
//         public static void main(String args[]){
//             Bird ostrich = new Bird();
//             ostrich.breathe();
            
           
//         }
//     }
    
//     //Base class
//     class Animal{
//         String color;
//         void eat(){
//             System.out.println("eats");
//         }
    
//         void breathe(){
//             System.out.println("breathes");
//         }
//     }
    
    
//     //derived class
//     class Mammals extends Animal{
//         void walk(){
//             System.out.println("walks");
//         }
//     }

//     class Fish extends Animal{
//         void swim(){
//             System.out.println("swim");
//         }
//     }

//     class Bird extends Animal{
//         void fly(){
//             System.out.println("fly");
//         }
//     }








// public class OOPs21 {                                      //overloading
//     public static void main(String args[]){
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(1, 2));                // Should print 3
//         System.out.println(calc.sum((float)1.5,(float)2.5));         // Should print 4.0
//         System.out.println(calc.sum(1, 2, 3));             // Should print 6
//     }
// }

// class Calculator {
//     int sum(int a, int b){
//         return a + b;
//     }

//     float sum(float a, float b){
//         return a + b;
//     }

//     int sum(int a, int b, int c){
//         return a + b + c;
//     }
// }








// public class OOPs21{                         //overiding
//     public static void main(String args[]){
//         Deer d = new Deer();
//         d.eat();

//     }
// }

// class Animal{
//     void eat(){
//         System.out.println("eats anything");
//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }








// import java.util.Scanner;

// public class OOPs21{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(a);
//     }
// }








// public class OOPs21{
//     public static void main(String args[]){
//         Horse h = new Horse();
//         h.eat();
//         h.walk();

//         Chicken c = new Chicken();
//         c.eat();
//         c.walk();


//     }
// }


// abstract class Animal{
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// } 

// class Horse extends Animal{
//     void walk(){
//         System.out.println("walk on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     void walk(){
//         System.out.println("walk on 2 legs");
//     }
// }








// public class OOPs21 {
//     public static void main(String args[]){
//         Mustang myHorse = new Mustang();
//         //Animal -> Horse -> Mustang
//     }
// }

// abstract class Animal {
//     String color;

//     Animal() {
//         System.out.println("Animal constructor called");
//     }

//     void eat() {
//         System.out.println("animal eats");
//     }

//     abstract void walk();
// }

// class Horse extends Animal {
//     Horse() {
//         System.out.println("Horse constructor called");
//     }

//     void changeColor() {
//         color = "dark brown";
//     }

//     void walk() {
//         System.out.println("walk on 4 legs");
//     }
// }

// class Mustang extends Horse {
//     Mustang() {
//         System.out.println("Mustang constructor called");
//     }
// }

// class Chicken extends Animal {
//     void walk() {
//         System.out.println("walk on 2 legs");
//     }
// }







// public class OOPs21 {                  //interfaces
//     public static void main(String args[]){
//         Queen q = new Queen();
//         q.moves();

//     }
// }

// interface chessplayer{
//     void moves();
// }

// class Queen implements chessplayer{
//     public void moves(){
//         System.out.println("all direction");
//     }
// }

// class Rook implements chessplayer{
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }
// }

// class king implements chessplayer{
//     public void moves(){
//         System.out.println("all direction(1 step)");
//     }
// }





// public class OOPs21 {                  //interfaces
//     public static void main(String args[]){
//         Beer b = new Beer();
//         b.moves();

//     }
// }

// interface herbivore{
//     void moves();
// }

// interface carnivore{
//     void moves();
// }

// class Beer implements herbivore, carnivore{
//     public void moves(){
//         System.out.println("Beer moves slowly looking for plants to eat");
//     }
// }






// public class OOPs21{                   //Static
//     public static void main(String args[]){

//         Student s1 = new Student();
//         s1.schoolname = "JMV";

//         Student s2 = new Student();
//         System.out.println(s2.schoolname);

//         Student s3 = new Student();
//         s3.schoolname = "ABC";


//     }
// }

// class Student{

//     static int returnpercentage(int math, int chem, int phy){
//         return(math + chem + phy) / 3;
//     }

//     String name;
//     int roll;

//     static String schoolname;

//     void setname(String name){
//         this.name=name;
//     }

//     String getname(){
//         return this.name;
//     }
// }






// public class OOPs21{           //super keyword
//     public static void main(String srgs[]){

//         Horse h = new Horse();
//     }
// }

// class Animal{
//     Animal(){
//         System.out.println("Animal constructor is called");
//     }
// }

// class Horse extends Animal{
//     Horse(){
//         super();
//         System.out.println("horse constructor is called");
//     }
// }





// public class OOPs21 {
//     public static void main(String args[]){
//         Horse h = new Horse();
//         System.out.println(h.color);
//     }
// }

// class Animal {
//     String color;

//     Animal(){
//         System.out.println("Animal constructor is called");
//     }
// }

// class Horse extends Animal {
//     Horse(){
//         super.color = "brown"; // Set the color attribute of the superclass
//         System.out.println("Horse constructor is called");
//     }
// }






/*                 practise Question                   */


// class Complex {
//     int real;
//     int imag;

//     public Complex(int r, int i) {
//         real = r;
//         imag = i;
//     }

//     public static Complex add(Complex a, Complex b) {
//         return new Complex((a.real + b.real), (a.imag + b.imag));
//     }

//     public static Complex diff(Complex a, Complex b) {
//         return new Complex((a.real - b.real), (a.imag - b.imag));
//     }

//     public static Complex product(Complex a, Complex b) {
//         return new Complex(
//             ((a.real * b.real) - (a.imag * b.imag)),
//             ((a.real * b.imag) + (a.imag * b.real))
//         );
//     }

//     public void printComplex() {
//         if (real == 0 && imag != 0) {
//             System.out.println(imag + "i");
//         } else if (imag == 0 && real != 0) {
//             System.out.println(real);
//         } else if (imag == 0 && real == 0) {
//             System.out.println("0");
//         } else {
//             System.out.println(real + "+" + imag + "i");
//         }
//     }
// }

// public class OOPs21 {
//     public static void main(String[] args) {
//         Complex c = new Complex(4, 5);
//         Complex d = new Complex(9, 4);

//         Complex e = Complex.add(c, d);
//         Complex f = Complex.diff(c, d);
//         Complex g = Complex.product(c, d);

//         e.printComplex();
//         f.printComplex();
//         g.printComplex();
//     }
// }






//  Q3,4


//  Question 5 :Read up about basics of exception handlingfrom here :
//    https://www.w3schools.com/java/java_try_catch.asp













