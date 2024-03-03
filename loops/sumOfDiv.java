
import java.util.Scanner;
public class sumOfDiv {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int t=sc.nextInt();
        int count=0;
        for (int i=m;i<n;i++){
            if(i%t==0){
                count+=i;
            }
        }
        System.out.println(count);
    }
}
