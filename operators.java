public class operators{
  public static void main(String[] args){
    // lets learn about operators now 
  // 1 . Arithmatic Operators(+,-,*,/,%,++,--)
int e1 = 10;
int e2 = 20;
System.out.println(e1 + e2);   // 30 add
System.out.println(e1 - e2);   // -10 minus 
System.out.println(e1 * e2);   // 200 multiply
System.out.println(e1 / e2);   // 0 divide
System.out.println(e1 % e2);   // 10 module

// NOTE: IN PRE DECREMENT / INCREMENT , + or - first then use the value and
// in POST DECREMENT AND INCREMENT it is opposite , use the value first then + or -

System.out.println(e1++);      // 10 post increment
System.out.println(e1);        // 11 10+1=11

System.out.println(--e2);      // 19 --20 = 20-1 , pre decrement
System.out.println(e2);        // 19 

System.out.println(++e1);      // 12 pre increment 11+1
System.out.println(e1);        // 12 

System.out.println(e2--);      // 19 post decrement
System.out.println(e2);        // 18 

// 2. Assingment operators ( += , -= , *= , /=, %=)
int e3 =  100 ; // intializing the value as e3 = 100 , storing 100 in e3 ( it can be changed later)
int e4 = 500;
// ((understand with example )a-=2 , a*=2 , a/=2 , a%=2 , a+= means ntg more then a=a-2,a=a*2,a=a/2,a=a%2,a=a+2)
// So lets guess the output 
e3+=400; // 100+400
e3-=100; // 500-100
e4+=e3; // 500+400
e4%=100; // 900%100 == 0
e3*=e3; // 400*400 = 160000
e4-=e3; // 0-160000 = -160000
e4=-(e4); // -(-160000) == 160000 , it is called unary operator to sign change
System.out.println(e3); // 160000
System.out.println(e4); // 160000

    
// logical operator and comparison ( relational ) operators :
Comparison (Relational) Operators: Compare values and return true or false. Examples include equal to (==), not equal to (!=), greater than (>), less than (<), greater than or equal to (>=), and less than or equal to (<=).
Logical Operators: Combine boolean expressions, including logical AND (&&), logical OR (||), and logical NOT (!).
// in comparison operator we perform two operations either == or != , lets understand them both
  int is1=32;
  int is2=33;
  boolean isSo= is1==is2; // false
  boolean isSo1= is1!=is2; // true as 32 != 33

// in logical operators we combine boolean and logical operations 
  // 0 and 1 = 0  , 0 or 1 = 1 , if a=false then !a = true , false = 0 and true = 1 
  boolean aIs=true;
  boolean bIs=false;
  System.out.println(aIs && bIs); // false
  System.out.println(aIs || bIs); // true
  System.out.println(!aIs); // false
  System.out.println(!bIs); // true

    
 //we will learn about shift operators , there are three types of shift operators which shifts bits ( binary representation of number ) either left or right 
        // Operator	Name
        // <<	Left Shift            // it works same for both positive and negative numbers
        // >>	Signed Right Shift   // for  positive numbers >>> and >> works same
        // >>>	Unsigned Right Shift // works as 2's compliment for negative numbers 
        // shift operators don't do work for floats , double numbers
        
        
        
        int takeShift=10; // in Binary we represent 10  as 01010
        takeShift>>=1; //00101
        System.out.println("After shifting one bit toward Right : "+takeShift ); // output - 5
        takeShift<<=1; // 01010
        System.out.println("After shifting one bit toward Left : "+takeShift ); // output - 10
        // let's take another example
        int takeShift2 = -9;
        // Note , in binary number representation , in positive integers , 0 is before the number representation , example : 0000101 this is 5
        // in negative integer representation , 1 is before the number example 10000000101 it  is -5
        takeShift2>>=1; // can you guess the output ?
        System.out.println("After shifting one bit toward right : "+takeShift2 );
        takeShift2<<=1;
        System.out.println("After shifting one bit toward left : "+takeShift2 );
        // let's now check the last of shift-operators :
        int takeShift3 = -10; // this is (-)10 10000001010
        takeShift3=takeShift3>>>1;// can you guess the output ? it will be a large positive number cause it gets 2's compliment ( flips the bit and changes the sign )
        System.out.println("After shifting one bit toward right : "+takeShift3);
        // let's try >>> for a positive number
        takeShift>>>=1;
        System.out.println("After shifting : " + takeShift ); // 01010  to 00101 , did you notice it , >>> behaves same as >> for positive numbers
        
    
}}
