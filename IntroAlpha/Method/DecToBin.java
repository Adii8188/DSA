import java.util.*;
public class DecToBin{
    public static void dtb(int n){
        long t=0;
        //int temp=n;
        int mod,div=n;
        int i=0;
        while(n>0){
            mod=n%2;
            //System.out.println(mod);
            n=n/2;
            //System.out.println(n);
            t=t+(mod*(int)Math.pow(10,i));
            System.out.println(t);
            i++;
        }
        //System.out.println(t);
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enetr the number for binary:");
    int n=sc.nextInt();
    dtb(n);
    System.out.println();
}
}