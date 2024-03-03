import java.util.Scanner;
public class Main7{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        int sub=(word.length())/2;
        System.out.println(word.substring(0,sub));
        
    }
}