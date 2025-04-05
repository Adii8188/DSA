import java.util.*;
public class Product{
    public static int pro(int a,int b){
        int c=a*b;
        return c;
    }
    public static int fact(int i){
       int  t=1;
        for(int n=i;n>0;n--){
            t=t*n;
        }
        return t;
    }
    public static int bino(int n,int r){
        int d=fact(n)/(fact(r)*fact(n-r));
        return d;
    }
public static void main(String arg[]){
    int a=10;
    int b=20;
   // int t;
    pro(10,20);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int x=sc.nextInt();
    System.out.println("Enter the value of r:");
    int y=sc.nextInt();
    System.out.println(fact(5));
    System.out.println(bino(x,y));
}
}