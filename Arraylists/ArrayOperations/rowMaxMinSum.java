import java.lang.reflect.Array; // Import the Array class from the java.lang.reflect package
import java.util.ArrayList; // Import the ArrayList class from the java.util package
import java.util.Arrays; // Import the Arrays class from the java.util package
import java.util.Collection; // Import the Collection interface from the java.util package
import java.util.Collections; // Import the Collections class from the java.util package
import java.util.Scanner; // Import the Scanner class from the java.util package

class one { // Define a class named "one"

    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        int M = sc.nextInt(); // Read an integer M from user input
        int N = sc.nextInt(); // Read an integer N from user input
        int[][] arr = new int[M][N]; // Create a 2D array named "arr" of size MxN
        ArrayList<Integer> max = new ArrayList<>(); // Create an ArrayList named "max" to store maximum values
        ArrayList<Integer> min = new ArrayList<>(); // Create an ArrayList named "min" to store minimum values
        ArrayList<Integer> sum = new ArrayList<>(); // Create an ArrayList named "sum" to store sum of rows
        int add = 0; // Initialize a variable "add" to store sum of row elements

        // Reading elements into the 2D array
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt(); // Read an integer and store it in the array at position (i, j)
            }
        }

        int minumum; // Declare an integer variable "minimum" to store minimum value of row
        int maximum; // Declare an integer variable "maximum" to store maximum value of row

        // Loop through each row of the 2D array
        for (int i = 0; i < M; i++) {
            minumum = arr[i][0]; // Initialize "minimum" with the first element of the row
            maximum = arr[i][0]; // Initialize "maximum" with the first element of the row
            
            // Loop through each element of the current row
            for (int j = 0; j < N; j++) {
                add += arr[i][j]; // Add the element to "add" to calculate sum of row

                // Check if the current element is smaller than the minimum value found so far
                if (minumum <= arr[i][j]) {
                    minumum = minumum; // Keep the current minimum value
                } else {
                    minumum = arr[i][j]; // Update the minimum value
                }

                // Check if the current element is greater than the maximum value found so far
                if (maximum >= arr[i][j]) {
                    maximum = maximum; // Keep the current maximum value
                } else {
                    maximum = arr[i][j]; // Update the maximum value
                }
            }
            min.add(i, minumum); // Add the minimum value of the row to the "min" ArrayList
            max.add(i, maximum); // Add the maximum value of the row to the "max" ArrayList
            sum.add(i, add); // Add the sum of row elements to the "sum" ArrayList
            add = 0; // Reset "add" to zero for the next row
        }

        // Print the ArrayLists containing maximum, minimum, and sum of row elements
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
