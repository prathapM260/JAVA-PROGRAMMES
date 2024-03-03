import java.util.Scanner;
class Main3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first=sc.nextLine();
        int second=sc.nextInt();
        System.out.println((first+" ").repeat(second));
    }
}