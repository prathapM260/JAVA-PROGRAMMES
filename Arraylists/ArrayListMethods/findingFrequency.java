import java.util.*;
import java.util.Scanner;
public class findingFrequency{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>arrList=new ArrayList<>();
        arrList.add(3);
        arrList.add(3);
        arrList.add(3);
        arrList.add(4);
        arrList.add(1);
        arrList.add(7);
        int frequency=Collections.frequency(arrList,(Integer)3);
        System.out.println(frequency);

    }
}