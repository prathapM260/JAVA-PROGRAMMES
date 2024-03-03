
import java.util.Scanner;
class HallowSquare{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        for (int i=0;i<M;i++){
            if(i>0 && i<M-1){
                System.out.println("* "+" ".repeat(N-2)+"*");
            }
            else{
                System.out.println("* ".repeat(N));
            }
        }
    }
}