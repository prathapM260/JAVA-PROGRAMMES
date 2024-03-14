import java.util.*;

public class ArrayToArrList {
    public static void main(String[]args){
        String[] sportsArr = {"Basketball", "Cricket", "Football"};
        System.out.println("sportsArrList: " + sportsArr);


        System.out.println("Type of sportsArr: " + sportsArr.getClass().getSimpleName());

        ArrayList<String>sportsArrList=new ArrayList<>(Arrays.asList(sportsArr));
        System.out.println("sportsArrList: " + sportsArrList);

        System.out.println("Type of sportsArr: " + sportsArrList.getClass().getSimpleName());




    }
    
}
