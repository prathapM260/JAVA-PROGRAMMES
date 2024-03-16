import java.util.*;


public class removeanElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>arrlist=new ArrayList<>(Arrays.asList(23,4,4,55,46,12,7,7));
        int M=sc.nextInt();
        int N=arrlist.size();
        List<Integer>slicedList=arrlist.subList(0,N-M);

        System.out.println(slicedList);
    }
    
}
