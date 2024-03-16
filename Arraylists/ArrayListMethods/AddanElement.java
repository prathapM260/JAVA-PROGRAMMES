import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;


public class AddanElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>arrlist=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
        int input=sc.nextInt();
        arrlist.add(input);
        System.out.println(arrlist);

    }
    
}
