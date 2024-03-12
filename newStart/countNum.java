
import java.util.Scanner;

public class countNum {
    static int CountNumbers(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count+=1;
        };
        return count;
    } ;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      System.out.println(CountNumbers(num));
     

    }
    
}
