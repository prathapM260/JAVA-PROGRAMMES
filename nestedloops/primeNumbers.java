
import java.util.Scanner;

public class primeNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for (int i=2;i<num;i++){
            for (int j=1;j<=num;j++){
                if(i%j==0){
                    count+=1;
                }

            }
            if(count==2){
                System.out.println(i);
            }
            count=0;
        }
    }

    
}
