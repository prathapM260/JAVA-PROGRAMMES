import java.util.*;
public class ArrayConcatenation {
    public static void main(String[]args){
        ArrayList<Integer> List1=new ArrayList<>();
        List1.add(0);
        List1.add(1);
        List1.add(2);
        List1.add(3);
        System.out.println(List1);

        ArrayList<Integer> List2=new ArrayList<>();
        List1.add(4);
        List1.add(5);
        List1.add(6);

        List1.addAll(List2);
        System.out.println(List1);


    }
    
}
