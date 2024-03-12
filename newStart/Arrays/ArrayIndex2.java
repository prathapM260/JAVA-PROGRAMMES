import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
class ArrIndex2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String []arr={"python","Java","Ruby","c","C++","JavaScript","Swift" };
        int num=sc.nextInt();
        int[]ar=new int[num];
        for (int i=0;i<num;i++){
             ar[i]=sc.nextInt();
            System.out.println(arr[ar[i]]);
        }
    }
}