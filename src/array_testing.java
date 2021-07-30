import java.util.Scanner;
import java.io.*;

public class array_testing {
    public static void main(String[] args) throws IOException {
        String[]arrayOfLetters = {"a","b","c"}; // Declare the array of letters
        arrayOfLetters = addElement(arrayOfLetters); // Call the addElement function
        outputObject(arrayOfLetters); // Call the outputObject function
    }

    public static String[] addElement(String[] arrayOfLetters) { // Function to add an element to the array
        String[] dummyArray = new String[arrayOfLetters.length + 1]; // Create a new array of the same size as the original array
        
        for (int i = 0; i < arrayOfLetters.length; i++) { // Loop through the array
            dummyArray[i] = arrayOfLetters[i]; 
        }

        arrayOfLetters[arrayOfLetters.length] = "New"; // Add a new element to the array
        Scanner in = new Scanner(System.in); // Create a Scanner object
        arrayOfLetters[arrayOfLetters.length-1] = in.nextLine(); // Add the new element to the array
        in.close(); // Close the Scanner object
        return arrayOfLetters; 
    }

    public static void outputObject(String[] arrayOfLetters) { // Function to output the array
        for (int i = 0; i < arrayOfLetters.length; i++) {
            System.out.println(arrayOfLetters[i]);
        }
    }

    // remove an element from the arrayOfLetters array based on the argument element
    public static void removeElement(String[] arrayOfLetters, String element) { // Function to remove an element from the array
        for (int i = 0; i < arrayOfLetters.length; i++) { // Loop through the array
            if (arrayOfLetters[i].equals(element)) { // If the element is equal to the argument element, then remove the element on the next line
                arrayOfLetters[i] = "";
            }
        }
    }

    // duplicate all of the elements in the arrayOfLetters array
    public static void duplicateAllElements(String[] arrayOfLetters) { // Function to duplicate all of the elements in the array
        for (int i = 0; i < arrayOfLetters.length; i++) { // Loop through the array
            arrayOfLetters[i] = arrayOfLetters[i] + arrayOfLetters[i]; // Add the element to itself
        }
    }
}
