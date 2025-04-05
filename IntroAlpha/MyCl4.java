import java.util.Scanner;
public class MyCl4{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the prize of pen:");
        float pen=sc.nextFloat();
        System.out.println("Enter the prize of pencile:");
        float pencile=sc.nextFloat();
        System.out.println("Enter the prize of Eraser:");
        float eraser=sc.nextFloat();
        float bill=(pen+pencile+eraser);
        System.out.println("The total bill is:"+bill);
        float per=bill+ (0.18f*bill);
       // float per=(bill*18)/100;
        System.out.println("The total bill is :"+(per));
    }
}