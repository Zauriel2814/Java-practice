package sg.edu.trentglobal;

import java.util.Arrays;

public class LambdaExpDemo {
    
    public static void demo(){

        // Create an array of numbers from 1 to 10
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Use Stream API and lambda expression to filter even numbers
        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();

        // Print the even numbers
        System.out.println("Even Numbers:");
        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }

    /*
     * Task 2: Implement a filter to produce an array with numbers greater than five 
     * 
     * - Implement an Arrays.stream similar to the demo() example
     * - Modify the filter() array with proper condition: n -> n > 5
     * - Add `LambdaExpDemo.youDo()` in the main method of App.java
     */
    public static void youDo(){
        // Create an array of numbers from 1 to 10
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] numbersGreaterThanFive = null;

        // Add code here

        // Print numbers > 5
        System.out.println("Numbers > 5:");
        for (int number : numbersGreaterThanFive) {
            System.out.println(number);
        }

    }
}
