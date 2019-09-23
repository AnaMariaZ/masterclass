import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] myArray= new int[5];
       // readIntegers(5);
        findMin(readIntegers(5));
    }

    private static int[] readIntegers(int count){
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[count];
        for (int i=0; i < array.length; i++){
            System.out.println("Please enter a number in your array");
            array[i] = keyboard.nextInt();
        }

        System.out.println("Your array is " + Arrays.toString(array));
        return array;
    }

    private static void findMin(int[] array){
        int minArray = array[0];
        for (int i=1; i < array.length; i++){
            if (minArray > array[i]){
                minArray = array[i];

            }
        }
        System.out.println("The minimum element is " + minArray);
    }
}
