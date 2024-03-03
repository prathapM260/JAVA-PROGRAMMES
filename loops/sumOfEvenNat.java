import java.util.Scanner;

public class sumOfEvenNat {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    long count=0;
    for (int i=m;i<n;i++){
        if(i%2==0){
            count+=i;
    
        }
        }
        System.out.println(count); 
    }
}
