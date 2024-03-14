import java.util.*;


public class ArrayListSlicing {
    public static void main(String[]args){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(25);

        ArrayList
        <Integer> sublist=new ArrayList<>(list1.subList(1,3));
        System.out.println("sublist is "+sublist);


    }
    
}
