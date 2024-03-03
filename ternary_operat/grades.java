
import java.util.Scanner;

public class grades {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float marks=sc.nextFloat();
        if(marks>85){
            System.out.println("A");
        }
        else if(marks>70&&marks<=85){
            System.out.println("B");
        }
        else if(marks>=60&&marks<=70){
            System.out.println("C");
        }
        else if(marks<60){
            System.out.println("F");
        }
    }
    
}
