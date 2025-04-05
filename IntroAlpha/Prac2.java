import java.util.*;
public class Prac2{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter your tempreture:");
    double tem=sc.nextDouble();
    if(tem>=100){
        System.out.println("You have No fever :");
    }else{
        System.out.println("You have Fever Please Concert Your Doctor");
    }
    System.out.println();
}
}