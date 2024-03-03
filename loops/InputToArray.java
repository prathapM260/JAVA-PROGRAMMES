import java.util.Scanner;
class InputToArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numbers[]=new int[num];
        for (int i=0;i<num;i++){
            numbers[i]=sc.nextInt();

        }
        for (int i=0;i<num;i++){
        System.out.print(numbers[i]);
        }
    }
}