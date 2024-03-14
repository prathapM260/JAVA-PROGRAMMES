import java.util.*;


public class ArrayListToArray {
    public static void main(String[]args){
        ArrayList<Integer> agesArrList = new ArrayList<>();
        agesArrList.add(1);
        agesArrList.add(2);
        agesArrList.add(3);
        agesArrList.add(4);
        System.out.println(agesArrList);
        System.out.println("agesArrayList is : "+agesArrList.getClass().getSimpleName());


            Integer []agesArr=new Integer[agesArrList.size()];
            agesArrList.toArray(agesArr);

            System.out.println("Array is: "+agesArr);
            System.out.println("agesArrayList is : "+agesArr.getClass().getSimpleName());


    }
    
}
