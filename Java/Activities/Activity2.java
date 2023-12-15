package activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] numbers = {10, 77, 10, 54, -11, 10};
        System.out.println("List of numbers: " + Arrays.toString(numbers));

        //Set constants
        int searchNumber = 10;
        int value = 30;

        //Print result
        System.out.println("Result: " + result(numbers, searchNumber, value));
    }

    public static boolean result(int[] numbers, int searchNumber, int value) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNumber) {

               // System.out.println(number);
                //Add them
                temp_sum += searchNumber;
                System.out.println("Sum : " + temp_sum) ;
            }

            //Sum should not be more than 30
            if (temp_sum > value) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == value;
    }
}
