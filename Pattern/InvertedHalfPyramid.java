import java.util.*;
public class InvertedHalfPyramid{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=a-i;j>=i;j--){
            System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
               System.out.print("*");
            }
            System.out.print("\n");
        }  
    }
   
}
