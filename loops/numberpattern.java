import java.util.Scanner;

class numberpattern {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            for (int j=1;j<N;j++){
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
