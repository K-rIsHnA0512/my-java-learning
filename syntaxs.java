package javagenesis;
import java.util.Scanner;
public class syntaxs{
    public static void main(String[]  args){

        // first of all , lets start with scanner class to take input from user
        // syntax : Scanner scanner = new Scanner(System.in);
        // System.in is used to take input from standard input device (keyboard)
        // example is :
        Scanner scanner = new Scanner(System.in); // creating a scanner object to take input from user
        System.out.println("Enter your name:");
        String name = scanner.nextLine(); // nextLine() method is used to take string input including spaces
        System.out.println("こんにちは" + name + "さん, お元気ですか？"); // printing the name in japanese but it will work only if the system supports unicode characters or else it will show some weird characters like ?????????? , lol .

        // facts about the scanner ,
        // 1. Scanner is a class in java.util package
        // 2. Scanner is used to take input from user
        // 3. Scanner is an object of the class
        // 4. Scanner is used to read input from standard input device (keyboard)
        // 5. Scanner has various methods like nextInt(), nextDouble(), nextLine(), etc.
        // 6. Scanner should be closed after use to prevent memory leaks
        // 7. Scanner can be used to read input from files as well



        
        // now further , we will learn about various syntax including arrays , loops , conditional statements , if-else , switch case , functions , classes and objects in this tutorial
        System.out.println("みなさんこんにちは。お元気ですか？");

        // starting with if-else conditional statement
        System.out.println("Enter a number to check if it is positive, negative or zero:");
        int number = scanner.nextInt(); // taking an integer input from user
        if(number>0){
            System.out.println("The number is positive");
        } else if(number<0){
            System.out.println("The number is negative");
        } else{
            System.out.println("The number is zero");
        }
        //NOTE : use else if for multiple conditions and else if / else conditions only work with if statement and if "if" statement is false only then else if / else will be executed

        // now we will learn about switch case statement ,
        System.out.println("Enter a number between 1 to 7 to get the corresponding day of the week:");
        int day = scanner.nextInt();
        // switch case statement
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        } // there is also the option for advance switch case which we will discuss later
        scanner.close(); // closing the scanner object to prevent memory leaks
    }}
