package javagenesis;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args){
        // Hey there! Welcome to Day 4 of the Java series.
        // Today, we'll be diving into some more interesting fundamental concepts of Java Language.
        // we will learn about while , do-while , for loops
        // Let's get started!

        // First, let's understand loops in Java.
        // Loops are used to execute a block of code repeatedly until a certain condition is met.
        // but do-while loop will execute the block of code written under while atleast one time before actually checking the condition , example 

        Scanner scan=new Scanner(System.in); // creating a scanner object to take input from user
        System.out.println("Enter a nonzero integer to check the do-while loop functionality: ");
        int getNum=scan.nextInt(); // enter a non zero element to check this 
        do{
            System.out.println("This will be printed atleast once");
        }while(getNum==0);
        System.out.println();

        // while loop and for loop will not be executed if the condition is false at the beginning 
        System.out.println("Enter A negative integer to check the while loop functionality and for loop functionality : ");
        int getNum2 = scan.nextInt();
        
        // while loop 
        while(getNum2>0){
            System.out.println("This will not be printed as the condition is false at the beginning");
        }
        // but when we put the valid conditions it will work fine like this 
        while(getNum2<0){
            System.out.println("This is " + getNum2 + " and this will be printed till the condition (getNum2<0) is true");
            getNum2++; // incrementing the value to eventually break the loop
        }
        System.out.println();
        System.out.println("Now moving to For Loop ");
        System.out.println();
        System.out.println("Enter A positive integer to check the For loop functionality : ");
        int getNum3=scan.nextInt();

        // same conditions as while goes for For Loop 
        for(int i=getNum3;i>0;i--){
            System.out.println("This is " + i + " and this will be printed till the condition (getNum3>0) is true ");
        }
        scan.close(); // closing the scanner object to prevent memory leaks


        // points to remember about loops : 
        // Loops are used to execute a block of code repeatedly untill a certain condition is met
        // why do we have different type of loops when while and for loop do the same thing ?
        // answer is : each loop has its own use case and advantages
        // while loop is used when the number of iterations is not known in advance
        // for loop is used when the number of iterations is known in advance
        // do-while loop is used when the block of code needs to be executed atleast once
        // Happy Learning , また会いましょう :) 
    }
}


