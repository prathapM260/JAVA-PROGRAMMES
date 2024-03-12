import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
class AdditionOfMatrix{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int arr1[][]=new int[M][N];
        int arr2[][]=new int [M][N];
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr2[i][j]=sc.nextInt();
            
            }
        }

        for (int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}