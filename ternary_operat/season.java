import java.util.Scanner;

public class season {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        if(month==1||month==11||month==12){
            System.out.println("Winter");
        }
        else if(month==2||month==3){
            System.out.println("Spring");
        }
        else if(month==4||month==5||month==6){
            System.out.println("Summer");
        }
        else if(month==7||month==8){
            System.out.println("Rainy");
        }
        else{
            System.out.println("Autumn");
        }
    }
    
}
