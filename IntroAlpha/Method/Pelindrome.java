import java.util.*;
public class Pelindrome{
    public static void pelindrome(int n){
        int s=n;
        int l=String.valueOf(n).length();
        int t=0,mod;
        //for(int i=1;i<=l;i++){
        while(n!=0){
            mod=n%10;
            //System.out.println(t);
            n=n/10;
            t=t*10+mod;
            
        }
        System.out.println(t);
        if(s==t){
            System.out.println("this number is pelindrome :"+ t);
        }else{
            System.out.println("this number is not pelindrome :"+t);
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    pelindrome(n);
    System.out.println();
}
}