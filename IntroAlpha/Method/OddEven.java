import java.util.*;
public class OddEven{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean t=isEven(n);
    System.out.println(t);
}
}