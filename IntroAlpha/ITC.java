import java.util.*;
public class ITC{
public static void main(String arg[]){
    int income, tax;double total;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the income:");
    income=sc.nextInt();
    if(income>0 && income<500000){
        System.out.println("0 % Tax ");
        System.out.println("your total amount is :"+income);
    }
    else if(income>500000 && income<=1000000){
        total= (income*0.2);
        System.out.println("your total amount with 20% of tax is :"+total);
    }else{
        total=(income*0.3);
        System.out.println("your total amount with 30% tax is :"+total);
    }
    System.out.println("Thank You!");
}
}