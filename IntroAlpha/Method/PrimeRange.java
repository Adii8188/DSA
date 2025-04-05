import java.util.*;
public class PrimeRange{
    public static void isprime(int a){
    //Scanner sc=new Scanner(System.in);
    
    //int a=sc.nextInt(); 
    boolean t=true;
    for(int i=2;i<=a;i++){
        t=true;
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                t=false;
                break;
                //continue;
            }
        }
        if(t==true){
                System.out.println("this number is prime :"+i);
            }
    }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("till the number you want to check for prime:");
    int a=sc.nextInt();
    isprime(a);
    System.out.println();
}
}