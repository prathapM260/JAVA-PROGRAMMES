import java.util.Scanner;

class loop1{
    public static void main(String[] args) {
        for (int i = 0; i < 2; i = i + 1) {  // Outer Loop
            System.out.println("Outer: " + i);
            for (int j = 0; j < 2; j = j + 1) {  // Inner Loop
                System.out.println(" Inner: " + j);
            }
        }
        System.out.println("After nested for loops");
    }
}