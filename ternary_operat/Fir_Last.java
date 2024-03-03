
import java.util.Scanner;
public class Fir_Last {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String password= sc.nextLine();
        char ch1=password.charAt(0);
        char ch2=password.charAt(password.length()-1);
        System.out.println(ch1 + "*".repeat(password.length()-2) + ch2);
      
    
}
}
