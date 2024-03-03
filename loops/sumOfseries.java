import java.util.Scanner;
class sumOfseries{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long num=2;
        long sum=0;
        for (int i=0;i<n;i++){
            sum+=num;
            num=num*10+2;


        }
        System.out.println(sum);


    }
}