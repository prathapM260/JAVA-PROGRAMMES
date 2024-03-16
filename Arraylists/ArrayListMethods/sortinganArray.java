import java.util.*;
import java.util.Scanner;
public class sortinganArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>arrList=new ArrayList<>();
        arrList.add(2);
        arrList.add(3);
        arrList.add(6);
        arrList.add(4);
        arrList.add(1);
        arrList.add(7);

        System.out.println(arrList);
        Collections.sort(arrList);
        System.out.println(arrList);

    }
}
