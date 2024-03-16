import java.util.*;
import java.util.Scanner;
public class rowMaxMinSum{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int [][]arr =new int[M][N];
        ArrayList <Integer>max=new ArrayList<>();
        ArrayList <Integer>min=new ArrayList<>();
        ArrayList<Integer>sum=new ArrayList<>();
  
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    
        int minimum;
        int maximum;
        for(int i=0;i<M;i++){
            minimum=arr[i][0];
            maximum=arr[i][0];
            int add=0;
            for (int j=0;j<N;j++){

                add+=arr[i][j];
                if(minimum<=arr[i][j]){
                    minimum=minimum;

                }else{
                    minimum=arr[i][j];
                }

                if(maximum>=arr[i][j]){
                    maximum=maximum;

                }
                else{
                    maximum=arr[i][j];
                }

            }
            min.add(minimum);
            max.add(maximum);
            sum.add(add);

        }
        System.out.println(max);
        
        System.out.println(min);
        System.out.println(sum);

    }

    }

