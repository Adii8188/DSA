import java.util.*;
public class Prime{
    public static void isprime(int n){
     boolean b=true;
    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            System.out.println("Number is not prime:");
            b=false;
            break;
        }
    }
    if(b==true){
    System.out.println("number is prime number:");
    }
}
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr the number for check prime or not :");
    int a=sc.nextInt();
    isprime(a);
    //     for(int i=2;i<a-1;i++){
    //     if(a%i==0){
    //         System.out.println("Second Number is not prime:");
    //         b=false;
    //         break;
    //     }
    // }
    // if(b==true){
    // System.out.println("number is prime number:");
    // }
}
}