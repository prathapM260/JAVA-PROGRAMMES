import java.util.*;

public class reversesortArray {
    public static void main(String[]args){
    ArrayList <Integer>arrList=new ArrayList<>();
        arrList.add(2);
        arrList.add(3);
        arrList.add(6);
        arrList.add(4);
        arrList.add(1);
        arrList.add(7);

        System.out.println(arrList);
        Collections.sort(arrList,Collections.reverseOrder());
        System.out.println(arrList);
    }
    
}
