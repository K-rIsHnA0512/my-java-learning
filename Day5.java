public class  Day5{
    int instanceNumber = 10;
    public static void main(String[] args){
        // let's get started with day-05 of java learning
        // lets get started with the difference between Stack And Heap Memory


        // Stack Memory -> this is used for storing primitive data types , i.e this is the region of memory used to store local variables , refferences , memory calls and it is managed in LIFO last in , first out
        // example of LIFO , suppose there is a row from 1 to 10 the 10 enters the row in the last but leaves first because it is the most recent and the closes to the gate
        // it is faster than heap memory , it is allocated and deleted automatically via JVM( Java_Virtual_Machine) and it is short in size and is temprory

        // Heap Memory-> this is used for storing objects(new), arrays , class instances , instance variable for example variable instanceNum(in this code) i.e this is the regions of memory used to store objects , stringpools
        // Heap Memory are used mostly now a day's because mostly Api , Frameworks get stored in Heap memory
        // until at least one reference exist the heap memory exists , after that it gets deleted by Garbage manager.
        // it has no specific order like LIFO


        // Moving Forward lets get started with Arrays :
    // first of all lets answer the following
    // 1. why arrays
    // 2. what are arrays
    // 3. how arrays work
    // 4. let's learn arrays
    // imagine we want to enter 30 students marks , we can do
        int m1 = 70;
        int m2= 60;
        int m3= 90 ; // ahh i am tired writting indivual keys and thier values , This Too many variables and not only hard to write but also Hard to manage , There is No looping , It Is Not scalable .
        // here comes the arrays ;
        int[] marks={70,90,60,70}; // one variable , multiple data ( but data should be of same type ) , easy to manage , scalable

    }
}
