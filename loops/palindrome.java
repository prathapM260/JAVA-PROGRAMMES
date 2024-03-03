import java.util.Scanner;
public class palindrome {
    public static void main{
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    str=str.toUpperCase();
    String reversed=new StringBuilder(str.reverse().toString());
    if(str.equals(reversed)){
        System.out.println("palinfrome");
    }
    else{
        System.out.println("not palindrome");
    }
}
}
