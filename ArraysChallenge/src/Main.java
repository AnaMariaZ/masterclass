import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    private static Scanner scanner = new Scanner(System.in);
    private static int[] values ;
    public static void main(String[] args) {
        //getIntegers(5);
       // printArrayValues();
        int [] myIntegers = getIntegers(5);
        int [] sorted = sortIntegers(myIntegers);
        printArrayValues(sorted);
        //System.out.println("Sorted array: " + sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int number){
        values = new int[number];
        System.out.println("Add number: ");

        for (int i = 0; i < values.length; i ++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArrayValues(int [] array){
        for (int i=0; i< array.length; i++){
            System.out.println("Printing the array values " + array[i]);
        }
    }

    public static int [] sortIntegers(int[] values){
        int[] sorted_values = new int[values.length];

        for (int i = 0; i < sorted_values.length; i++) {
            sorted_values[i] = values[i];
        }

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sorted_values.length - 1; i++) {
                    if (sorted_values[i] < sorted_values[i + 1]) {
                        temp = sorted_values[i];
                        sorted_values[i] = sorted_values[i + 1];
                        sorted_values[i + 1] = temp;
                        flag = true;
                    }
                }

        }
        return sorted_values;
    }
}
