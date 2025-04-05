 import java.util.*;
 public class Large3num{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.print("Enter the first number:");
    a=sc.nextInt();
    System.out.print("Enter the second number :");
    b=sc.nextInt();
    System.out.print("ENter the third number:");
    c=sc.nextInt();
    large3num(a,b,c);

    System.out.println();
}
    public  static void large3num(int a,int b, int c){
            if(a>b){
             if(a>c){
                System.out.println("A is the Large Number:");
             }else{
                System.out.println("C is largest number:");
             }
            }else{
                if(b>c){
                    System.out.println("B IS largest Number:");
                }
                else{
                    System.out.println("c is largest :");
                }
            }
    }
}