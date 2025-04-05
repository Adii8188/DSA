import java.util.*;
public class practice1{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    if(num>=0){
        System.out.println("Number is Positive :");
    }else{
        System.out.println("Number is Negative :");
    }
    System.out.println();
}
}