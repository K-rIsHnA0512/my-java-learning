import java.util.Scanner;
class Day6{
    public static void main(String[] args){
        // today is day 6 lets continue where we left from , before starting let me tell iti know java , c , html  , css ( working on python , javascript rn ) but i am posting it daily just a bit everyday so i dont get fed up doing the same stuff
        // lets learn about Arrays and Strings for today


        // what is An Array ?
        // here is defination :
        // According to GfG , an array is a linear data structure that stores a collection of elements of the same data type
        // in contiguous memory locations. It is a fixed-size, homogeneous data structure that enables random access to elements using a 0-based index.
        // in simpler words , Array is a box which stores the data of same type and it has fixed size , it can be modified afterwords

        // why we need Arrays ?
        // it's obvious , Because they store and manage large collection of data ( same type i.e int , float , char , double , etc)

        // here is the first method to declare an array 
        int[] numbers=new int[5]; // simply declared the arrayDataType VariableName = new ( to create the array ) datatye[sizeOfTheArray];
        numbers[0]=10; // array index starts from 1 to array.length -1 
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
      
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);  // printing each element of array on separate lines starting from array[0] to array[array.length-1]
        }
    }}

