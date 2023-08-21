package sg.edu.trentglobal;

import java.util.Optional;

public class OptionalDemo {
    public static void demo(){

        // Optional with value
        Optional<String> optionalValue = Optional.of("Hello, Optional!");

        // Check if value is present
        if (optionalValue.isPresent()) {
            String value = optionalValue.get();
            System.out.println(value); // Prints "Hello, Optional!"
        }

        // Default value if value is absent
        Optional<String> emptyOptional = Optional.empty();

        // If null, return "Default Value"
        String result = emptyOptional.orElse("Default Value");
        System.out.println(result); // Prints "Default Value"
    }

    /*
     * Task 1: 
     * - Check if "optionalValue" is null. 
     * - If it is null, prints "Hello!". 
     * - If it is not null, prints the defined value.
     * - Add `OptionalDemo.youDo();` to App.java's main method
     */
    public static void youDo(){
        String value = null; // Change this value to any string value to test your code

        Optional<String> optionalValue = Optional.of(value);

        // Add code here
    }
}
