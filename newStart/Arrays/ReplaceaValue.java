import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;

public class ReplaceaValue {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int [][]arr1=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr1[i][j]=sc.nextInt();

            }
        }
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        int replace=sc.nextInt();
        int value=sc.nextInt();
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                if (arr1[i][j]==replace){
                    arr1[i][j]=value;
                }
                System.out.print(arr1[i][j]+"");
            }
            System.out.println();
        }

    }
    
}
