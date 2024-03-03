import java.util.Scanner;

public class polygon {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sides=sc.nextInt();
       if(sides<3){
        System.out.println("Not Polygon");
       }
       else if(sides==3){
        System.out.println("Triangle");
       }
       else if(sides==4){
        System.out.println("Quadrilateral");
       }
       else if(sides==5){
        System.out.println("Pentagon");
       }
       else{
        System.out.println("Big Polygon");
       }
    }
    
}
