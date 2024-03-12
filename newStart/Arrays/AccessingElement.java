import java.util.Scanner;

class AccessingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr = new int[m][n];
        
        // Reading input values for the array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Printing the 2D array with the desired structure
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " "); // Print each element of the array
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        // Print the value at index (x, y)
        System.out.println("Value at index (" + x + ", " + y + "): " + arr[x][y]);
    }
}
