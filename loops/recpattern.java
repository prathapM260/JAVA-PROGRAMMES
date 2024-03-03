import java.util.Scanner;

public class recpattern {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=0;j<M;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
