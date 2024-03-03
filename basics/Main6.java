import java.util.Scanner;
public class Main6{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int num=word.length();
        System.out.println(word.substring(num-1));
    }
}