import java.util.Scanner;

public class sumOfAvg {
        public static void main(String[]args){
            Scanner sc =new Scanner(System.in);
                int []arr=new int[10];
                int count=0;
                for (int i=1;i<10;i++){
                    arr[i]=sc.nextInt();
                    count+=i;
                }

                System.out.println(count);
                double avg=count/10;
                System.out.println(avg);

            
        }
}
