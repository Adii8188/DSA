import java.util.*;
class Complex1{
    public static void main(String g[]){
        Complex c=new Complex();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number for sum,diffrence and product :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum of the numbers is :"+c.sum(a,b));
        System.out.println("Diffrence  of the numbers is :"+c.diff(a,b));
        System.out.println("Product of the numbers is :"+c.pro(a,b));
    }
}
class Complex{
    int sum(int a,int b){
        int c=a+b;
        return c;
    }

    int diff(int a,int b){
        int c=a-b;
        return c;
    }

    int pro(int a,int b){
        int c=a*b;
        return c;
    }
}