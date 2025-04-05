import java.util.*;
public class DateToBin{
  public static void DecToBin(String n){
        int s=String.valueOf(n).length();
        String t="";int mod,ff;
        System.out.println(s);
        ff=n;
        for(int i=0;i<s;i++){
            //f= mod(ff);
            mod=n%10;
            //System.out.println(f);
           // ff=div(ff);
           n=n/10;
            //System.out.println(ff);
            t=t+mod;
            //t=t+mod*(int)Math.pow(2,i);
        }
        System.out.println(t);
    }

public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    // int n=s.length();
    // int i=0;
    // while(n>0){
    // char ch=s.charAt(i);
    // int nn=Integer.ValueOf(s);
    // }
    DecToBin(s);
    //System.out.println(nn);
}
}