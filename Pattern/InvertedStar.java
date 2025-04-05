import java.util.*;
public class InvertedStar{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=4;j>=i;j--){
            System.out.print("*");
        }
         System.out.print("\n");
    }
   
}
}