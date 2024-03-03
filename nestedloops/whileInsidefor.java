
import java.util.Scanner;
public class whileInsidefor {
    
        public static void main(String[] args) {
            for (int i = 0; i < 2; i = i + 1) {  //  for loop begins
                System.out.println("Outer For Loop: " + i);
                int counter = 0;
    
                while (counter <=2) {  //  while loop begins
                    System.out.println(" Inner While Loop: " + counter);
                    counter = counter + 1;
                }
            } 
        }
    }

