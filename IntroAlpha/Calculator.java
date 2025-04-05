import java.util.*;
public class Calculator{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter the two numbers :");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Want oeration you want to perfrom:");
    String ch=sc.next();
    char c=ch.charAt(0);
    switch(c){
        case '+':
            add(a,b);
            break;
        case '-':
            min(a,b);
            break;
        case '*':
            mul(a,b);
            break;
        case '/':
            div(a,b);
            break;
        case '%':
            mod(a,b);
            break;
        default:
            System.out.println("Please Enter the valid Operation (+,-,*,/,%)");
    }
    System.out.println();
} 
public static void add(int a,int b){
     int c=a+b;
     System.out.println("Sum of the number :"+c);
}
public static void min(int a,int b){
    int c=a-b;
    System.out.println("Minus of the number is:"+c);
} 
public static void mul(int a,int b){
    int c=a*b;
    System.out.println("The multiplications of the numbers is :"+c);
}
public static void div(int a,int b){
    float c=a/b;
    System.out.println("The division of the numbers is :"+c);
} 
public static void mod(int a,int b){
    int c=a%b;
    System.out.println("The mod of the numbers is :"+c);
}

}