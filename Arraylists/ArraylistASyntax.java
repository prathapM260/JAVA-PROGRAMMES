import java.util.*;


public class ArraylistASyntax {
    public static void main(String[]args){
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Guava");
        System.out.println("ArrayList is"+arrayList);

        String firstElement=arrayList.get(0);
        System.out.println(firstElement);


        arrayList.set(1,"Grapes");
        System.out.println(arrayList);


        arrayList.remove(2);
        System.out.println("ArrayList after removal: " + arrayList);

        boolean containsBanana = arrayList.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        int size = arrayList.size();
        System.out.println("Size of ArrayList: " + size);

        /* Iterating over the Arraylist */
        System.out.println("Iterating an arraylist");
        for(String fruits:arrayList){
            System.out.print(fruits+" ");
           
        
        }

        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);;

    }
    
}