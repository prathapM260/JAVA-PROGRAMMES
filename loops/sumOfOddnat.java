
import java.util.Scanner;
public class sumOfOddnat {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                count+=i;

            }   
        }
        System.out.println(count);
    }
}
