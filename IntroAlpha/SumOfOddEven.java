import java.util.*;
public class SumOfOddEven{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int t=0,t1=0;
    char ch;
    do{
        System.out.print("Enter the number:");
    int a=sc.nextInt();
    if(a%2==0){
        t=t+a;
    }else{
        t1=t1+a;
    }
    System.out.println("you want to enter more number:");
     ch=sc.next().charAt(0);
    }while(ch=='y' || ch=='Y');
    System.out.println("your sum of Even number is :"+t);
    System.out.println("Your sum of Odd number is:"+t1);
}
}