import java.util.*;
public class Factorial{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int t=1;
    for(int i=a;i>0;i--){
       t=t*i;
    }
    System.out.println(t);
}
}