
import java.util.Scanner;
class Main5{
    public static void main(String[] args){
        Scanner st=new Scanner(System.in);
        String value=st.nextLine();
        int a= st.nextInt();
        char f=value.charAt(a);  /*  Retrieving the character at the index "a" 
        from the string stored in "value" and storing it in the variable "f"*/
        System.out.println(f);
        st.close();
    }
}
