import java.util.*;
import java.util.Scanner;
public class positionIntheArray {
    
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        ArrayList<Integer>numbers=new ArrayList<>();
        for (int i=0;i<N;i++){
            numbers.add(sc.nextInt());
        }
        int index;
        for (int i=0;i<N;i++){
            if(numbers.get(i)==K||numbers.get(i+1)==K){
                System.out.println(0);
                break;
            }
            else if(numbers.get(i)<K&&numbers.get(i+1)>K){
                numbers.add(i+1,K);
                index=i+1;
                System.out.println(index);
                break;
            }
        }
        System.out.println(numbers);

    }


}
