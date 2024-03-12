import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;


public class printPrincipleDiagonalMatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int m=Math.min(M,N);
        int [][]arr1=new int[M][N];
        int []newArr=new int[m];
        for(int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                arr1[i][j]=sc.nextInt();

            }
        }

        for(int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                if(i==j){
                    newArr[i]=arr1[i][j];
                }
            }
        }
        System.out.print(Arrays.toString(newArr));
    }
    
}
