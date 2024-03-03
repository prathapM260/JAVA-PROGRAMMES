import java.util.Scanner;

public lucky2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int input=sc.nextInt();
        String output=(input%6==0)
        ?"Number is divisible by 6" 
        :(input%3==0)?"Number is divisible by 3"
        :(input%2==0)?"Number is divisible by 2"
        :"Number is not divisible by 2, 3 or 6";
         System.out.println(output);
        
    }
    
}
