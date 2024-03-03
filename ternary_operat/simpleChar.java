import java.util.Scanner;
class simpleChar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char cha=sc.next().charAt(0);
        int first=sc.nextInt();
        int second=sc.nextInt();
        if(cha=='+'){
            System.out.println(first+second);
        }
        else if(cha=='-'){
            System.out.println(first-second);
        }
        else if(cha=='*'){
            System.out.println(first*second);
        }
        else if(cha=='/'){
            System.out.println((float)(first/second));
        }
        else{
            System.out.println(first%second);
        }
    }
}