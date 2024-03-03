import java.util.Scanner;
class hallowRectangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        for (int i =0;i<M;i++){
                if(i>0 &&i<M-1){
                        System.out.println("* "+" ".repeat(N)+"* ");
                }
                else{
                    System.out.println("* ".repeat(N));
                }
        }
    }
}