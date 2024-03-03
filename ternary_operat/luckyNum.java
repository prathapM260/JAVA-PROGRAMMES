import java.util.Scanner;

public class luckyNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String newStr=String.valueOf(num);
        String first=newStr.substring(0,1);
        String second=newStr.substring(1,2);
        int firstNum = Integer.parseInt(first);  

        int secondNum = Integer.parseInt(second);
        boolean sum = (firstNum + secondNum == 7);
        boolean isSeven = (firstNum == 7 || secondNum == 7);
        boolean isMultiple = (num % 7 == 0);
         
        if (sum || isSeven || isMultiple) {
            System.out.println("Special Number");
        }
        else {
            System.out.println("Normal Number");
        }
    }

    
}
