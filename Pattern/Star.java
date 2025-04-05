import java.util.*;
public class Star{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=1;i<5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    //System.out.println();
}
}