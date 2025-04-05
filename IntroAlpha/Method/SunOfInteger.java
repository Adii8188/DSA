import java.util.*;
public class SunOfInteger{
    public static void sum(int n){
        int t=0,mod;
        while(n!=0){
            mod=n%10;
            t=t+mod;
            n=n/10;
        }
        System.out.println("the sum of the number is :"+t);
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the integer for sum:");
    int n=sc.nextInt();
    sum(n);
    System.out.println();
}
}