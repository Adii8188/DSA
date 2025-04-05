import java.util.*;
public class BinToDeci{
    public static int mod(int n){
        int t=n%10;
        return t;
    }
    public static int div(int n){
        return n/10;
    }
    public static void bintodec(int n){
        int s=String.valueOf(n).length();
        int t=0,f,ff;
        System.out.println(s);
        ff=n;
        for(int i=0;i<s;i++){
            //f= mod(ff);
            f=ff%10;
            //System.out.println(f);
           // ff=div(ff);
           ff=ff/10;
            //System.out.println(ff);
            t=t+f*(int)Math.pow(2,i);
        }
        System.out.println(t);
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    bintodec(a);
    System.out.println();
}
}