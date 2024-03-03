import java.util.Scanner;
class specialEleven{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if(num%11==0 || num%11==1){
                System.out.println("special Eleven");
            }
            else{
                System.out.println("not special Number");
            }

        }
    }