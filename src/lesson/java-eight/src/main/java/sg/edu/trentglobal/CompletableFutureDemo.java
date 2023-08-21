package sg.edu.trentglobal;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    
    public static void demo(){

        // Create a CompletableFuture for sending an SMS asynchronously
        CompletableFuture<String> sendSmsFuture = CompletableFuture.supplyAsync(() -> {

            // Simulate sms sending takes 2 seconds
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "SMS is sent!"; // Return the status message
        });

        // Print the status message when the asynchronous code is completed
        sendSmsFuture.thenAccept(result -> System.out.println("Result: " + result));

        // Wait for task to complete
        try {
            sendSmsFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    /*
     * Task 3: Implement sendEmailFuture using CompletableFuture
     * 
     * - Email has no receipt, you do not expect any return data.
     * - Since no receipt, we will use CompletableFuture.runAsync() instead
     * - When runAsync() is called, task completion is no longer thenAccept()
     * - Once the email sending is completed asynchronously, print "Email sent!"
     * - Google how to use "runAsync()"
     */
    public static void youDo(){
        // Create a CompletableFuture for sending an SMS asynchronously
        CompletableFuture<Void> sendEmailFuture = CompletableFuture.runAsync(() -> {

            // Simulate sms sending takes 2 seconds
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Add code here to print "Email Sent!" after asynchronous code is completed
        

        // Wait for task to complete
        try {
            sendEmailFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
