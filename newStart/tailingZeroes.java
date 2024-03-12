import java.util.Scanner;

public class tailingZeroes {

    static int tailZeroes(int n){
        int res=0;
        int powerOf=5;
        while(n>=powerOf){
            res=res+(n/powerOf);
            powerOf=powerOf*5;
        }
        return res;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tailZeroes(n));
    }
    
}
