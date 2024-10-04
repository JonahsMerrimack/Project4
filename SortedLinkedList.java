import java.util.Collections;  // Reuse of the LinkedList class from the java.util package
import java.util.LinkedList; // Reuse of the Collections utility class from the java.util package
import java.util.Scanner;     // Reuse of the Scanner class for reading user input

/**
 * The SortedLinkedList program implements an application that reads a list of integers
 * from the command line input and stores them in a LinkedList, sorting them from
 * the smallest to the largest value.
 * 
 * <p>This program reads input from the console until the user provides no further input
 * and then outputs the sorted list.
 * 
 * @author Jonah Wilson
 * @since 2024-09-23
 */
public class SortedLinkedList {

    /**
     * This is the main method which makes use of the Collections framework to sort
     * and store integers in a LinkedList.
     * 
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Create a LinkedList to store Integer values
        // Reuse of the LinkedList data structure, which already implements necessary list operations
        LinkedList<Integer> numbers = new LinkedList<>();

        // Scanner to read input from the user
        // Reuse of the Scanner class for reading input from the command line
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (type 'exit' to finish):");

        // Read input and add numbers to the list
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // Using the add method from the LinkedList class (code reuse of LinkedList methods)
                int number = scanner.nextInt();
                numbers.add(number);
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Please enter a valid integer or 'exit' to finish.");
                }
            }
        }

        // Sort the LinkedList using Collections.sort
        // Reuse of the Collections.sort method to sort the list (code reuse of sorting algorithm)
        Collections.sort(numbers);

        // Output the sorted list
        System.out.println("Sorted list: " + numbers);
        
        // Close the scanner
        // Reuse of the close method from the Scanner class
        scanner.close();
    }
}
