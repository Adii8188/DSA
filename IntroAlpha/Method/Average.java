import java.util.*;
public class Average{
    public static void avg(int n1,int n2,int n3){
        float t=(n1+n2+n3)/3;
        System.out.println("The Average Of your number is :"+t);
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
    avg(n1,n2,n3);
    System.out.println();
}
}