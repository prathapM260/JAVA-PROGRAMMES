import java.util.*;
import java.util.Scanner;


public class insertanElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int index=sc.nextInt();
        ArrayList <Integer>arrList=new ArrayList<>(Arrays.asList(23,234,34,34,2,4,2));
        System.out.println(arrList);
        arrList.add(index,input);
        System.out.println(arrList);
    }
    
}
