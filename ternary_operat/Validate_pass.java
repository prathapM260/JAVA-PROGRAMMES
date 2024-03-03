import java.util.Scanner;

 class Validate_pass {
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String one=sc.nextLine();
            System.out.println((one.length())>7?"true":"false");
    }
    
}