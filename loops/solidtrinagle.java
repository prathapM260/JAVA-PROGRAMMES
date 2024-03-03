import java.util.Scanner;
class solidtriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<2*N;i++){
            if(i<=N){
                System.out.println(" ".repeat(N-i)+"* ".repeat(i));
            }
            else{
                System.out.println(" ".repeat(i-N)+"* ".repeat(2*N-i));
            }
        }
    }
}