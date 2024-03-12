import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class TransposeMatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();

        int N=sc.nextInt();
        int [][]arr=new int[M][N];
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();

            }

            for (int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    System.out.print(arr[i][j]);
                }
            }


        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

