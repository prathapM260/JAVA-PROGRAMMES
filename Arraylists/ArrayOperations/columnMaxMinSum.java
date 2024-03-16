import java.util.*;

import java.util.Scanner;


public class columnMaxMinSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][]arr=new int[M][N];
        ArrayList<Integer>max=new ArrayList<>();
        ArrayList<Integer>min=new ArrayList<>();
        ArrayList<Integer>sum=new ArrayList<>();
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int minimum;
        int maximum;
        
        for (int i=0;i<N;i++){
             minimum=arr[0][i];
            maximum=arr[0][i];
            int add=0;
            for (int j=0;j<M;j++){
                
                add+=arr[j][i];
                if(minimum<=arr[j][i]){
                    minimum=minimum;

                }
                else{
                    minimum=arr[j][i];
                }

                if(maximum>=arr[j][i]){
                    maximum=maximum;

                }
                else{
                    maximum=arr[j][i];
                }
            }

                min.add(i,minimum);
                max.add(i,maximum);
                sum.add(i,add);
                add=0;

            }

            System.out.println(max);
            System.out.println(min);
            System.out.println(sum);
        }



    }
    
    
    
    

