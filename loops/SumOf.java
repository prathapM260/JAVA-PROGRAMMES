import java.util.Scanner;

public class SumOf {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        long sum=0;
        for(int i=0;i<=m;i++){
            sum+=i;
            
        }
        System.out.println(sum);
    }
    
}
